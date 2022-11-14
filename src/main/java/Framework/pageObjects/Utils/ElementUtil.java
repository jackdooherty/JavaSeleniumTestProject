package Framework.pageObjects.Utils;

import Framework.pageObjects.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class ElementUtil extends BaseClass {

    static Properties properties = PropertiesUtil.loadFrameworkProperties();

    public static void clickElementById(String element)
    {
        driver.findElement(By.id(element)).click();
    }

    public static void clickElementByXpath(String element)
    {
        driver.findElement(By.xpath(element)).click();
    }

    public static void enterTextById(String element, String text)
    {
        driver.findElement(By.id(element)).sendKeys(text);
    }

    public static void enterTextByXpath(String element, String text)
    {
        driver.findElement(By.xpath(element)).sendKeys(text);
    }

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
