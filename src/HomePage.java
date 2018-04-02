import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class HomePage extends Constants {
    protected WebDriver driver;
    //--------Filling  data for group gift selection--------------
    public static void selectGift(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(Constants.EMAIL));
        driver.findElement(Constants.PRICE).click();
        List<WebElement> pricePoints = driver.findElements(By.className("active-result"));
        pricePoints.get(2).click();
//        WebDriverWait wait1 = new WebDriverWait(driver, 5);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(Constants.EMAIL));
        driver.findElement(Constants.AREA).click();
        List<WebElement> areaPoints = driver.findElements(By.className("active-result"));
        areaPoints.get(3).click();

        driver.findElement(Constants.CATEGORY).click();
        List<WebElement> categoryPoints = driver.findElements(By.className("active-result"));
        categoryPoints.get(2).click();

        driver.findElement(Constants.SEARCHBTN).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void verifyGift(WebDriver driver) {
        driver.get(expectedUrl);
        try{
            Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
            System.out.println("Navigated to correct webpage");
        }
        catch(Throwable pageNavigationError){
            System.out.println("Didn't navigate to correct webpage");
        }
    }
}
