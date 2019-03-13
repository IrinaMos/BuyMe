import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Constants {
    // Registration page constants
    public static String pelet = "הרשמה ל-BUYME";
    public static By SIGN = By.id("il.co.mintapp.buyme:id/googleButton");
    public static By SIGNUP = By.tagName("strong");
    public static By ID = By.id("ember856");
    public static By EMAIL = By.id("ember857");
    public static By PASSWORD = By.id("valPass");
    public static By REPASSWORD = By.id("ember859");
    public static By CONSENT = By.tagName("label");
    public static By SUBMIT = By.cssSelector("[type=submit]");
    public static By REGISTRATIONPAGE = By.cssSelector("[type=submit]");
    //------------------------------------------------------------------------------------
    // Home page constants
    public static String peletgift = "תוצאות חיפוש";
    public static By PRICE = By.className("chosen-single");
    public static By AREA = By.xpath("//span[.='אזור']");
    public static By CATEGORY = By.xpath("//span[.='קטגוריה']");
    public static By SEARCHBTN = By.cssSelector("[type=submit]");
    public static String expectedUrl = "https://buyme.co.il/search?budget=2";

    //------------------------------------------------------------------------------------
    // Gift page constants
    public static By GIFT = By.className("text-wrapper");
    public static By MONEY = By.xpath("//*[@class='form-control input-theme input-cash ember-view ember-text-field']");
 //   public static By BTN = By.xpath("//*[@type='submit']");
    public static By RADIOBTN = By.className("circle-wrapper checked");
    public static By RECEIVER = By.className("error-newline reciver-name");
//    public static By RECEIVER = By.xpath("//input[@type='text']");
    public static By SENDER = By.xpath("//input[@id='sender-name']");
    public static By EVENT = By.xpath("//span[.='לאיזה אירוע?']");
    public static By BLESS = By.id("msg");
    public static By PIC = By.xpath("//input[@type='file']");
    public static final By RADIOBTNSEND = By.xpath("//label[@class='send-now']");
    public static final By SMSBTN = By.className("btn-send-option-inner");
    //------------------------------------------------------------------------------------
    // SendANDReceiver page constants
    public static By SPHONE = By.xpath("//input[@type='tel']");
    public static By RPHONE = By.id("resendReciver");
    public static By SUBMITSAVE =By.className("overlay-buttons");
//    public static By SUBMITSAVE = By.xpath("//button[@type='text']");
    public static By SUBMITFORM = By.xpath("//button[@type='submit']");
}