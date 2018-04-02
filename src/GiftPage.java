import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class GiftPage extends Constants {
    protected WebDriver driver;
//--------Filling  data of selected gift --------------
        public static void selectGiftData(WebDriver driver) throws InterruptedException {
            driver.findElement((Constants.GIFT)).click();
            WebDriverWait wait = new WebDriverWait(driver, 5 );
            wait.until(ExpectedConditions.invisibilityOfElementLocated(Constants.GIFT));
            driver.findElement((Constants.MONEY)).sendKeys("150");
       //     driver.findElement((Constants.BTN)).click();
            driver.findElement((Constants.MONEY)).sendKeys(Keys.ENTER);
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 //          driver.findElement(Constants.RADIOBTN).isSelected();
//           driver.findElement(Constants.RECEIVER).sendKeys("Mir");
            driver.findElement(By.className("form-control")).sendKeys("Mir");
            driver.findElement(Constants.SENDER).sendKeys("Mos");
            driver.findElement(Constants.EVENT).click();
            List<WebElement> eventPoints = driver.findElements(By.className("active-result"));
            eventPoints.get(2).click();
            driver.findElement(Constants.BLESS).clear();
            driver.findElement(Constants.BLESS).sendKeys("MAZAL TOV");
            driver.findElement(Constants.PIC).sendKeys("C:\\Users\\irina\\Desktop\\Sean's birthday\\download.jpg");
            driver.findElement(Constants.RADIOBTNSEND).isSelected();

        }
//
//    public static void verifyGiftData(WebDriver driver){
//            driver.get(expectedUrl);
//            try {
//                Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
//                System.out.println("Navigated to correct webpage");
//            } catch (Throwable pageNavigationError) {
//                System.out.println("Didn't navigate to correct webpage");
//            }
       }
