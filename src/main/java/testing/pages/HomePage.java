package testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import testing.pages.validators.ValidHomePage;
import util.LocatorLoader;

import java.time.Duration;
import java.util.Map;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        String baseUrl = "https://automationexercise.com";
        driver.get(baseUrl);
        log.info("Browser: {} baseUrl: {}", driver.getTitle(),baseUrl);

    }

    public LoginPage navigateToLogin() {
        Map<String,By> locators = LocatorLoader.loadLocators("/homePage.json");
        driver.findElement(locators.get("signup_login")).click();
        log.info("Navigated to login page");
        return new LoginPage(driver);
    }



    public ValidHomePage scrollDownWithoutArrow(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        return new ValidHomePage(driver);
    }
}
