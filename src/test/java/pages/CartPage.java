package pages;

import bases.BaseTest;
import bases.PageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageBase {
    @FindBy(css = "button.btn.btn-success")
    WebElement placeOrder;
 public CartPage(WebDriver driver){
     super(driver);
 }
 public  void clickOnPlaceOrder(){
     placeOrder.click();
 }
}
