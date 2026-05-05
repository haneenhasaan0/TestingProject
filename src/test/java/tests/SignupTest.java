package tests;

import bases.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class SignupTest extends BaseTest {

    @Test
    public void validLoginTest() {

        HomePage homePage = new HomePage(driver);
        homePage.clickLogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("haneen@gmail.com", "1234567");
    }
}