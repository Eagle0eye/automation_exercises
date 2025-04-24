package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    private final By username = By.id("username");
    private final By password = By.id("password");
    private final By email = By.id("email");

    private final By registerButton = By.id("register");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

}
