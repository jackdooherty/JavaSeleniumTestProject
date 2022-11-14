package Framework.pageObjects.PageObjects;

import Framework.pageObjects.BaseClass;
import Framework.pageObjects.Utils.ElementUtil;
import org.checkerframework.checker.signature.qual.FullyQualifiedName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.Element;
import java.time.Duration;

import static Framework.pageObjects.BaseClass.driver;

public class LoginPage extends BaseClass
{
    //id
    private static String emailAddress = "input-email";
    private static String password = "input-password";

    //xpath
    private static String submitLogin = "//input[@class='btn btn-primary']";
    private static String myAccount = "//span[text()='My Account']";
    private static String loginBtn = "//a[text()='Login']";
    private static String myAccountText = "//h2[text()='My Account']";

    public static void selectLogin()
    {
        ElementUtil.findAndWaitByXpath(myAccount);
        ElementUtil.clickElementByXpath(myAccount);
        ElementUtil.findAndWaitByXpath(loginBtn);
        ElementUtil.clickElementByXpath(loginBtn);
    }

    public static void provideValidLoginDetails(String emailAddressValue, String passwordValue) throws InterruptedException {
        ElementUtil.findAndWaitByID(emailAddress);
        ElementUtil.enterTextById(emailAddress, emailAddressValue);
        ElementUtil.enterTextById(password, passwordValue);
    }

    public static void submitLogin()
    {
        ElementUtil.clickElementByXpath(submitLogin);
        ElementUtil.findAndWaitByXpath(myAccountText);
    }

}
