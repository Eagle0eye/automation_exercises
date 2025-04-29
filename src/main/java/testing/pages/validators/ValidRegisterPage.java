package testing.pages.validators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.pages.BasePage;

import java.util.Map;

import static util.LocatorLoader.loadLocators;

public class ValidRegisterPage extends BasePage {
    private final Map<String, By> validators = loadLocators("/validators/register.json");

    public ValidRegisterPage(WebDriver driver) {
        super(driver);
    }
    public String verifyRegisterForm() {
        return driver.findElement(validators.get("verify")).getText();
    }
}
