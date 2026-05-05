package tests;

import bases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.*;

import java.time.Duration;

public class AddToCartTest extends BaseTest {

    @Test
    public void addToCartFlow() {

        HomePage home = new HomePage(driver);
        home.clickLogin();
        // Login
        LoginPage login = new LoginPage(driver);
        login.login("haneen@gmail.com", "1234567");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));
        home.clickItem();

        // Item page
        ItemPage item = new ItemPage(driver);
        item.clickAddToCartAndAcceptAlert();
       home.clickOnCartButton();
        CartPage cartPage=new CartPage(driver);
        cartPage.clickOnPlaceOrder();
        OrderPage orderPage=new OrderPage(driver);
        orderPage.fillOrder(
                        "Haneen",
                        "Egypt",
                        "Cairo",
                        "123456789",
                        "May",
                        "2026"
                );

        orderPage.clickPurchase();
    }
}