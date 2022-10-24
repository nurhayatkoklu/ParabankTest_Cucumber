package Pages;

import Utilities.GenelWebDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Parent {

    static WebDriverWait wait;


    public Parent() {
        wait = new WebDriverWait(GenelWebDriver.getDriver(), Duration.ofSeconds(15));
    }

    public void sendKeysFunction(WebElement element, String value) {
        waitUntilVisible(element);
        scrollToElement(element);
        element.clear();
        element.sendKeys(value);
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) GenelWebDriver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickFunction(WebElement element) {
        waitUntilClickable(element);
        scrollToElement(element);
        element.click();
    }

    public void waitUntilClickable(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void verifyContainsText(WebElement element, String text) {
        waitUntilVisible(element);
        Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
    }

    public static void delay(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
