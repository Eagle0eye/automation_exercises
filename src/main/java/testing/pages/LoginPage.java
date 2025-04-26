package testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import testing.dto.RegisterForm;

import static testing.mapper.RegisterMapper.ToRegisterForm;

public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String entered_email, String entered_password) {

        By email = By.cssSelector(".login-form > form:nth-child(2) > input:nth-child(2)");
        By password = By.cssSelector(".login-form > form:nth-child(2) > input:nth-child(3)");
        By login = By.cssSelector(".login-form > form:nth-child(2) > input:nth-child(3)");

        driver.findElement(email).sendKeys(entered_email);
        driver.findElement(password).sendKeys(entered_password);
        driver.findElement(login).click();
        log.info("~login email: {} password: {}",entered_email ,entered_password );
    }


}
