package pages;

import bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    @FindBy(css = "button[onclick='logIn()']")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String user, String pass) {

        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(user);

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pass);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButton.click();
    }
}