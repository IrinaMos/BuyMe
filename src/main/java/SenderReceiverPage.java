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

import static java.lang.Thread.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

public class SenderReceiverPage extends Constants {
    protected WebDriver driver;
    //--------Filling all data of sender and receiver--------------
    public static void selectData(WebDriver driver) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        driver.findElement(Constants.SMSBTN).click();
     //   wait.until(ExpectedConditions.invisibilityOfElementLocated(Constants.SMSBTN));

        driver.findElement(Constants.SPHONE).sendKeys("0501111111");
        driver.findElement(Constants.RPHONE).sendKeys("0502222222");
        Thread.sleep(5000);
        driver.findElement(Constants.SUBMITSAVE).click();
        Thread.sleep(5000);
        driver.findElement(Constants.SUBMITFORM).sendKeys(Keys.ENTER);
    }
}

