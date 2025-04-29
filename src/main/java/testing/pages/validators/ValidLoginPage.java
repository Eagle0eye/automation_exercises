package testing.pages.validators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.pages.BasePage;

import java.util.Map;

import static util.LocatorLoader.loadLocators;

public class ValidLoginPage extends BasePage {

    private final Map<String, By> locators = loadLocators("/validators/login.json");

    public ValidLoginPage(WebDriver driver) {
        super(driver);
    }

    public String verifyLoginPage(){
        String message = driver.findElement(locators.get("message")).getText().toLowerCase();

        log.info("verify message login page: {}",message);
        return message;
    }
}
