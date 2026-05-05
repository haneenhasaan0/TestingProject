package pages;

import bases.PageBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ItemPage extends PageBase {
    @FindBy(css = ".btn-success")
    WebElement addToCart;

    public ItemPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }



    public void clickAddToCartAndAcceptAlert() {

        wait.until(ExpectedConditions.visibilityOf(addToCart));
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();

        Alert alert = wait.until(ExpectedConditions.alertIsPresent());

        alert.accept();
    }

}