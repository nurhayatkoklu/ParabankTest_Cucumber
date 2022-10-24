package StepDefinitions;

import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @And("Fill in the Login Username input as {string}")
    public void fillInTheLoginUsernameInputAs(String username) {
        loginPage.findAndSend("username", username);
    }

    @And("Fill in the Login Password input as {string}")
    public void fillInTheLoginPasswordInputAs(String password) {
        loginPage.findAndSend("passwordLogin", password);
    }

    @When("Click to Log in button")
    public void clickToLogInButton() {
        loginPage.findAndClick("loginBtn");
    }

    @Then("Verify that you are logged in")
    public void verifyThatYouAreLoggedIn() {
        loginPage.findAndContainsText("successMessage", "Welcome");
    }

    @Then("error message should be displayed")
    public void errorMessageShouldBeDisplayed() {
        loginPage.findAndContainsText("errorMessage", "not be verified");
    }

    @And("Click to Log out button")
    public void clickToLogOutButton() {
        loginPage.findAndClick("LogOutBtn");
    }
}
