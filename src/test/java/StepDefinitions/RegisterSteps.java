package StepDefinitions;

import Pages.RegisterPage;
import Utilities.GenelWebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    @Given("Navigate to Para Bank Website")
    public void navigateToParaBankWebsite() {
        WebDriver driver = GenelWebDriver.getDriver();
        driver.get("https://parabank.parasoft.com/");
        driver.manage().window().maximize();
    }

    @And("Click to Register Menu button")
    public void clickToRegisterMenuButton() {
        registerPage.findAndClick("registerMenuBtn");
    }

    @And("Fill in the First Name input as {string}")
    public void fillInTheFirstNameInputAs(String firstName) {
        registerPage.findAndSend("firstName", firstName);
    }

    @And("Fill in the Last Name input as {string}")
    public void fillInTheLastNameInputAs(String lastName) {
        registerPage.findAndSend("lastName", lastName);
    }

    @And("Fill in the Address input as {string}")
    public void fillInTheAddressInputAs(String address) {
        registerPage.findAndSend("address", address);
    }

    @And("Fill in the City input as {string}")
    public void fillInTheCityInputAs(String city) {
        registerPage.findAndSend("city", city);
    }

    @And("Fill in the State input as {string}")
    public void fillInTheStateInputAs(String state) {
        registerPage.findAndSend("state", state);
    }

    @And("Fill in the Zip Code input as {string}")
    public void fillInTheZipCodeInputAs(String zipCode) {
        registerPage.findAndSend("zipcode", zipCode);
    }

    @And("Fill in the Phone input as {string}")
    public void fillInThePhoneInputAs(String Phone) {
        registerPage.findAndSend("phoneNumber", Phone);
    }

    @And("Fill in the SSN input as {string}")
    public void fillInTheSSNInputAs(String ssn) {
        registerPage.findAndSend("ssn", ssn);
    }

    @And("Fill in the Username input as {string}")
    public void fillInTheUsernameInputAs(String username) {
        registerPage.findAndSend("userName", username);
    }

    @And("Fill in the Password input as {string}")
    public void fillInThePasswordInputAs(String password) {
        registerPage.findAndSend("password", password);
    }

    @And("Fill in the Confirm input as {string}")
    public void fillInTheConfirmInputAs(String confirm) {
        registerPage.findAndSend("passwordConfirm", confirm);
    }

    @When("Click to Register button")
    public void clickToRegisterButton() {
        registerPage.findAndClick("registerBtn");
    }

    @Then("Successfully message should be displayed")
    public void successfullyMessageShouldBeDisplayed() {
        registerPage.findAndContainsText("successMessage", "Your account was created successfully");
    }

}
