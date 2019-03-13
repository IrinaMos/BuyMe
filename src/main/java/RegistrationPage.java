import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class RegistrationPage extends Constants {
    protected WebDriver driver;
//-------SignUP function---------------------------------------------------
    public static void clickSign(WebDriver driver) {
        driver.findElement(Constants.SIGN).click();
        driver.findElement(Constants.SIGNUP).click();
        driver.findElement(Constants.ID).sendKeys("Irina");
        driver.findElement(Constants.EMAIL).sendKeys("test3ing02@u75.com");
        driver.findElement(Constants.PASSWORD).sendKeys("a123456");
        driver.findElement(Constants.REPASSWORD).sendKeys("a123456");
        driver.findElement(Constants.CONSENT).click();
        driver.findElement(Constants.SUBMIT).click();
    }
//-----------VerifyLoadPage after registration----------------------
    public static void verifyLogin(WebDriver driver) {
        System.out.println(driver.findElement(Constants.REGISTRATIONPAGE).getText());
        assertEquals(Constants.pelet, driver.findElement(Constants.REGISTRATIONPAGE).getText());
    }
}
