package testing.pages;

import testing.interfaces.baseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePage implements baseActions {
    protected WebDriver driver;
    public static final Logger log = LoggerFactory.getLogger(BasePage.class);


    public final By logout= By.id("logout");
    public final By signInOrLogin = By.cssSelector(".nav > li:nth-child(4) > a:nth-child(1)");


    public BasePage(WebDriver driver) {
        String baseUrl = "http://automationexercise.com";
        PageFactory.initElements(driver, baseUrl);
        log.info("Browser: {} baseUrl: {}", driver.getTitle(),baseUrl);
    }

    public LoginPage navigateToLogin() {
        driver.findElement(signInOrLogin).click();
        log.info("Navigated to login page");
        return new LoginPage(this.driver);
    }

    @Override
    public void logout() {
        driver.findElement(logout).click();
        log.info("Logout");
    }


}