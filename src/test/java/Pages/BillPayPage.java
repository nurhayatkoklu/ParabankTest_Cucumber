package Pages;

import Utilities.GenelWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BillPayPage extends Parent {
    public BillPayPage() {
        PageFactory.initElements(GenelWebDriver.getDriver(), this);
    }

    @FindBy(css = "div[id=\"leftPanel\"] li:nth-of-type(4)")
    private WebElement billPayBtn;

    @FindBy(css = "[name=\"payee.name\"]")
    private WebElement payeeName;

    @FindBy(css = "[name=\"payee.address.street\"]")
    private WebElement billAddress;

    @FindBy(css = "[name=\"payee.address.city\"]")
    private WebElement billCity;

    @FindBy(css = "[name=\"payee.address.state\"]")
    private WebElement billState;

    @FindBy(css = "[name=\"payee.address.zipCode\"]")
    private WebElement billZipCode;

    @FindBy(css = "[name=\"payee.phoneNumber\"]")
    private WebElement billPhone;

    @FindBy(css = "[name=\"payee.accountNumber\"]")
    private WebElement billAccount;

    @FindBy(css = "[name=\"verifyAccount\"]")
    private WebElement billVerifyAccount;

    @FindBy(css = "[name=\"amount\"]")
    private WebElement billAmount;

    @FindBy(css = "[value=\"Send Payment\"]")
    private WebElement sendPayment;

    @FindBy(css = "[ng-show=\"showResult\"]>[class=\"title\"]")
    private WebElement completeMessage;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "payeeName":
                myElement = payeeName;
                break;
            case "billAccount":
                myElement = billAccount;
                break;
            case "billCity":
                myElement = billCity;
                break;
            case "billAddress":
                myElement = billAddress;
                break;
            case "billAmount":
                myElement = billAmount;
                break;
            case "billPhone":
                myElement = billPhone;
                break;
            case "billZipCode":
                myElement = billZipCode;
                break;
            case "billVerifyAccount":
                myElement = billVerifyAccount;
                break;
            case "billState":
                myElement = billState;
                break;

        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        switch (strElement) {
            case "billPayBtn":
                myElement = billPayBtn;
                break;
            case "sendPayment":
                myElement = sendPayment;
                break;
        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "completeMessage":
                myElement = completeMessage;
                break;
        }
        verifyContainsText(myElement, text);
    }
}
