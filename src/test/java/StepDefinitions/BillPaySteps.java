package StepDefinitions;

import Pages.BillPayPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillPaySteps {

    BillPayPage billPayPage = new BillPayPage();

    @And("Click to Bill Pay button")
    public void clickToBillPayButton() {
        billPayPage.findAndClick("billPayBtn");

    }

    @And("Fill in the Payee Name input as {string}")
    public void fillInThePayeeNameInputAs(String payeeName) {
        billPayPage.findAndSend("payeeName", payeeName);
    }

    @And("Fill in the Bill Address input as {string}")
    public void fillInTheBillAddressInputAs(String billAddress) {
        billPayPage.findAndSend("billAddress", billAddress);
    }

    @And("Fill in the Bill City input as {string}")
    public void fillInTheBillCityInputAs(String billCity) {
        billPayPage.findAndSend("billCity", billCity);
    }

    @And("Fill in the Bill State input as {string}")
    public void fillInTheBillStateInputAs(String billState) {
        billPayPage.findAndSend("billState", billState);
    }

    @And("Fill in the Bill Zip Code input as {string}")
    public void fillInTheBillZipCodeInputAs(String billZipcode) {
        billPayPage.findAndSend("billZipCode", billZipcode);
    }

    @And("Fill in the Bill Phone input as {string}")
    public void fillInTheBillPhoneInputAs(String billPhone) {
        billPayPage.findAndSend("billPhone", billPhone);
    }

    @And("Fill in the Account input as {string}")
    public void fillInTheAccountInputAs(String billAccount) {
        billPayPage.findAndSend("billAccount", billAccount);
    }

    @And("Fill in the Verify Account input as {string}")
    public void fillInTheVerifyAccountInputAs(String verifyAccount) {
        billPayPage.findAndSend("billVerifyAccount", verifyAccount);
    }

    @And("Fill in the Amount input as {string}")
    public void fillInTheAmountInputAs(String billAmount) {
        billPayPage.findAndSend("billAmount", billAmount);
    }

    @When("Click to Send Payement button")
    public void clickToSendPayementButton() {
        billPayPage.findAndClick("sendPayment");
    }

    @Then("Bill Payment Complete message should be displayed")
    public void billPaymentCompleteMessageShouldBeDisplayed() {
        billPayPage.findAndContainsText("completeMessage", "Complete");


    }
}
