package Framework.pageObjects;
import Framework.pageObjects.Utils.PropertiesUtil;
import org.openqa.selenium.WebDriver;
import java.util.Properties;
import static Framework.pageObjects.Utils.GetBrowserUtil.getBrowserDriver;

public class BaseClass {

    public static WebDriver driver;
    static Properties properties = PropertiesUtil.loadApplicationProperties();
    static Properties props = PropertiesUtil.loadFrameworkProperties();

    public static void initializeDriver()
    {
        String url = properties.get("application.url").toString();
        String browser = props.getProperty("browser.driver");

        driver = getBrowserDriver(browser);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public static void closeDriver()
    {
        driver.close();
        driver.quit();
    }

}
