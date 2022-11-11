package Framework.pageObjects.Utils;

import Framework.pageObjects.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class BrowserUtil extends BaseClass {

    static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static WebElement findAndWaitByID(String element)
    {
        String timeout = properties.getProperty("timeout.maximum");
        WebElement element1 = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(timeout))).until(ExpectedConditions.elementToBeClickable(By.id(element)));
        return element1;
    }

    public static WebElement findAndWaitByXpath(String element)
    {
        String timeout = properties.getProperty("timeout.maximum");
        WebElement element1 = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(timeout))).until(ExpectedConditions.elementToBeClickable(By.xpath(element)));
        return element1;
    }

}
