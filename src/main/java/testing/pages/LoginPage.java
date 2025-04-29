package testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testing.register.RegisterForm;

import java.util.Map;

import static testing.register.RegisterMapper.ToRegisterForm;
import static util.LocatorLoader.loadLocators;

public class LoginPage extends BasePage{
    private final Map<String, By> locators = loadLocators("/loginPage.json");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String entered_email, String entered_password) {



        driver.findElement(locators.get("email")).sendKeys(entered_email);
        driver.findElement(locators.get("password")).sendKeys(entered_password);
        driver.findElement(locators.get("loginButton")).click();
        log.info("login email: {} password: {}",entered_email ,entered_password );
    }
    public RegisterPage register(String path) {

        RegisterForm form = ToRegisterForm(path);

        driver.findElement(locators.get("registeredName")).sendKeys(form.getName());
        driver.findElement(locators.get("registeredEmail")).sendKeys(form.getEmail());
        log.info("register with name : {} email: {}", form.getName(), form.getEmail());
        driver.findElement(locators.get("signupButton")).click();
        return new RegisterPage(driver);
    }



}
