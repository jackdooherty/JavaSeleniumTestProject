package Framework.pageObjects;

import Framework.pageObjects.Utils.PropertiesUtil;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Properties;

public class BaseClass {

    public static WebDriver driver;

    public static void initializeChromeDriver()
    {
        Properties properties = PropertiesUtil.loadApplicationProperties();
        String url = properties.get("application.url").toString();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver()
    {
        driver.close();
        driver.quit();
    }

}
