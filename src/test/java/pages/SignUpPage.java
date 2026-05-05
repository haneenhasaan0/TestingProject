package pages;

import bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpPage extends PageBase {

    @FindBy(id = "sign-username")
    WebElement username;

    @FindBy(id = "sign-password")
    WebElement password;

    @FindBy(css = "button[onclick='register()']")
    WebElement signUpButton;

    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void signUp(String user, String pass) {
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(user);

        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys(pass);

        wait.until(ExpectedConditions.elementToBeClickable(signUpButton));
        signUpButton.click();
    }
}