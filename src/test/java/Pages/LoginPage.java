package Pages;

import Utilities.GenelWebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Parent {

    public LoginPage() {

        PageFactory.initElements(GenelWebDriver.getDriver(), this);
    }

    @FindBy(css = "[name=\"username\"]")
    private WebElement username;

    @FindBy(css = "[name=\"password\"]")
    private WebElement passwordLogin;

    @FindBy(css = "[value=\"Log In\"]")
    private WebElement loginBtn;

    @FindBy(css = "[class=\"smallText\"]>b")
    private WebElement successMessage;

    @FindBy(css = "[class=\"error\"]")
    private WebElement errorMessage;

    @FindBy(css = "div[id=\"leftPanel\"] li:nth-of-type(8)")
    private WebElement LogOutBtn;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {
            case "username":
                myElement = username;
                break;
            case "passwordLogin":
                myElement = passwordLogin;
                break;
        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {

        switch (strElement) {
            case "loginBtn":
                myElement = loginBtn;
                break;
            case "LogOutBtn":
                myElement = LogOutBtn;
                break;

        }

        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {
            case "successMessage":
                myElement = successMessage;
                break;
            case "errorMessage":
                myElement = errorMessage;
                break;

        }

        verifyContainsText(myElement, text);
    }
}
