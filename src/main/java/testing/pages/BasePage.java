package testing.pages;

import org.openqa.selenium.support.ui.WebDriverWait;
import testing.interfaces.baseActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

public class BasePage implements baseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public static final Logger log = LoggerFactory.getLogger(BasePage.class);

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));
         }


    @Override
    public void logout() {
        By logout= By.cssSelector(".navbar-nav > li:nth-child(4) > a:nth-child(1)");
        driver.findElement(logout).click();
        log.info("Logout");
    }


}