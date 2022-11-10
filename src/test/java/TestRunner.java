import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"src/test/java/StepDefinitions"},
        plugin = { "pretty", "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/cucumber.json"})

public class TestRunner {


}
