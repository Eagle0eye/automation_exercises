package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    // Login
    public final By email = By.id("email");
    public final By password = By.id("password");
    public final By login = By.id("login");

    // Register
    public final By registeredName = By.id("name");
    public final By registeredEmail = By.id("email");
    public final By signup = By.id("register");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String entered_email, String entered_password) {
        driver.findElement(email).sendKeys(entered_email);
        driver.findElement(password).sendKeys(entered_password);
        driver.findElement(login).click();
        log.info("~login email: {} password: {}",entered_email ,entered_password );
    }

    public RegisterPage clickRegisterButton(String name,String email) {
        driver.findElement(registeredName).sendKeys(name);
        driver.findElement(registeredEmail).sendKeys(email);
        log.info("~register with name : {} email: {}",name,email);
        driver.findElement(signup).click();
        return new RegisterPage(driver);
    }
}
