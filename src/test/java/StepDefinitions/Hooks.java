package StepDefinitions;

import Framework.pageObjects.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends BaseClass {

    @Before
    public static void setUp() {
        BaseClass.initializeChromeDriver();
    }

    @After
    public static void tearDown(Scenario scenario) {

        if (scenario.isFailed()) {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","Failure-Screenshot");
        } else {
            TakesScreenshot ts = (TakesScreenshot) driver;
            byte[] src = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(src,"image/png","Success-screenshot");
        }

        BaseClass.closeDriver();

    }

}
