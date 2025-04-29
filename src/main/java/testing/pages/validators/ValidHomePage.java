package testing.pages.validators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import testing.pages.BasePage;
import util.LocatorLoader;

import java.util.HashMap;
import java.util.Map;

public class ValidHomePage extends BasePage {
    private final Map<String, By> locators = LocatorLoader.loadLocators("/validators/home.json");
    public ValidHomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isHomePage() {

        return false;
    }

    public boolean verifySUBSCRIPTIONisVisible() {
        return driver.findElement(locators.get("subscription")).isDisplayed();
    }
}
