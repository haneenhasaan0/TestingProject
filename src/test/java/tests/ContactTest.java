package tests;

import bases.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.ContactPage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class ContactTest extends BaseTest {

    @Test
    public void contact() {

        HomePage home = new HomePage(driver);

        home.clickLogin();

        LoginPage login = new LoginPage(driver);
        login.login("haneen@gmail.com", "1234567");
        home=new HomePage(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("logInModal")));
        home.clickContact();

        ContactPage contact = new ContactPage(driver);

        contact.fillContactForm(
                "haneen@gmail.com",
                "Haneen",
                "Hello, this is a test message"
        );

        contact.clickSend();
    }
}