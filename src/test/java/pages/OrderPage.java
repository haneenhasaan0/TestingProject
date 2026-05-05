package pages;

import bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrderPage extends PageBase {

    public OrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "name")
    WebElement name;

    @FindBy(id = "country")
    WebElement country;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "card")
    WebElement card;

    @FindBy(id = "month")
    WebElement month;

    @FindBy(id = "year")
    WebElement year;

    @FindBy(xpath = "//button[text()='Purchase']")
    WebElement purchaseBtn;

    public void fillOrder(String n, String c, String ci, String cc, String m, String y) {

        wait.until(ExpectedConditions.visibilityOf(name));

        name.sendKeys(n);
        country.sendKeys(c);
        city.sendKeys(ci);
        card.sendKeys(cc);
        month.sendKeys(m);
        year.sendKeys(y);
    }

    public void clickPurchase() {
        wait.until(ExpectedConditions.elementToBeClickable(purchaseBtn)).click();
    }
}