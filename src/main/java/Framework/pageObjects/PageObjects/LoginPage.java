package Framework.pageObjects.PageObjects;

import Framework.pageObjects.BaseClass;
import org.checkerframework.checker.signature.qual.FullyQualifiedName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Framework.pageObjects.BaseClass.driver;

public class LoginPage extends BaseClass
{

    @FindBy(id = "input-email")
    private static WebElement emailAddress;

    @FindBy(id = "input-password")
    private static WebElement password;

    @FindBy(xpath = "input[value='Login']")
    private static WebElement submitLogin;

    @FindBy(xpath = "//span[text()='My Account')]")
    private static WebElement myAccount;

    @FindBy(xpath = "//a[text()='Login')]")
    private static WebElement loginBtn;

    @FindBy(xpath = "//h2[text()='My Account')]]")
    private static WebElement myAccountText;

    public static void selectLogin()
    {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(myAccount));
        myAccount.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(loginBtn));
        loginBtn.click();
    }

    public static void provideValidLoginDetails(String emailAddressValue, String passwordValue) throws InterruptedException {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(emailAddress));
        emailAddress.sendKeys(emailAddressValue);
        password.sendKeys(passwordValue);
        Thread.sleep(2000);
    }

    public static void submitLogin()
    {
        submitLogin.click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(myAccountText));
    }

}
