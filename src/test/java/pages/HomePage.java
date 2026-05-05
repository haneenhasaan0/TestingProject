package pages;

import bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "login2")
    WebElement loginButton;

    @FindBy(id = "cartur")
    WebElement cartButton;
    @FindBy(xpath = "//a[text()='Contact']")
    WebElement contactButton;

    @FindBy(linkText = "Samsung galaxy s6")
    WebElement itemButton;

    public void clickOnCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
    }

    public void clickContact() {
        wait.until(ExpectedConditions.elementToBeClickable(contactButton)).click();
    }

    public void clickLogin() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public void clickItem() {
        wait.until(ExpectedConditions.elementToBeClickable(itemButton)).click();
    }
}