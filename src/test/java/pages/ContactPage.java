package pages;

import bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactPage extends PageBase {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "recipient-email")
    WebElement contactEmail;

    @FindBy(id = "recipient-name")
    WebElement contactName;

    @FindBy(id = "message-text")
    WebElement message;

    @FindBy(xpath = "//button[text()='Send message']")
    WebElement sendBtn;

    public void fillContactForm(String name, String email, String msg) {

        wait.until(ExpectedConditions.visibilityOf(contactName));
        contactEmail.sendKeys(email);
        contactName.sendKeys(name);
        message.sendKeys(msg);
    }

    public void clickSend() {
        wait.until(ExpectedConditions.elementToBeClickable(sendBtn)).click();
    }
}