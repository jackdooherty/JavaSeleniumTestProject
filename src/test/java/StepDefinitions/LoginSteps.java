package StepDefinitions;
import Framework.pageObjects.Utils.PropertiesUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import Framework.pageObjects.PageObjects.LoginPage;
import io.cucumber.java.en.When;

import java.util.Properties;

public class LoginSteps {

    Properties properties = PropertiesUtil.loadUserProperties();

    @Given("a user navigates to the login page")
    public void a_user_navigates_to_the_login_page() {
        LoginPage.selectLogin();
    }
    @When("I provide valid login details")
    public void i_provide_valid_login_details() throws InterruptedException {
        String email = properties.getProperty("username");
        String password = properties.getProperty("password");
        LoginPage.provideValidLoginDetails(email, password);
    }

    @Then("I should successfully be able to login")
    public void i_should_successfully_be_able_to_login() {
        LoginPage.submitLogin();
    }
}
