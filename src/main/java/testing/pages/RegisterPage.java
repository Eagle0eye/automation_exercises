package testing.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testing.dto.RegisterForm;
import testing.locators.RegisterLocators;

import java.util.Map;

import static testing.mapper.RegisterMapper.ToRegisterForm;

public class RegisterPage extends BasePage {

    private final By submit = By.id("submit");
    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    public RegisterPage clickRegisterButton(String path) {

        RegisterForm form = ToRegisterForm(path);
        By registeredName = By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(2)");
        By registeredEmail = By.cssSelector(".signup-form > form:nth-child(2) > input:nth-child(3)");
        By signup = By.cssSelector("button.btn:nth-child(5)");

        driver.findElement(registeredName).sendKeys(form.getName());
        driver.findElement(registeredEmail).sendKeys(form.getEmail());
        log.info("~register with name : {} email: {}",form.getName(),form.getEmail());
        driver.findElement(signup).click();
        return new RegisterPage(driver);
    }

    public void fillRegisterForm(String path) {
        Map<String, By> locators = new RegisterLocators().formLocators();
        WebElement title = driver.findElement(locators.get("title"));

        WebElement name = driver.findElement(locators.get("name"));
        WebElement email = driver.findElement(locators.get("email"));
        WebElement password = driver.findElement(locators.get("password"));

        WebElement days = driver.findElement(locators.get("days"));
        WebElement months = driver.findElement(locators.get("months"));
        WebElement years = driver.findElement(locators.get("years"));


        WebElement newsletter = driver.findElement(locators.get("newsletter"));
        WebElement special_offers = driver.findElement(locators.get("special_offers"));

        WebElement firstname = driver.findElement(locators.get("firstname"));
        WebElement lastname = driver.findElement(locators.get("lastname"));

        WebElement company = driver.findElement(locators.get("company"));
        WebElement mobileNumber = driver.findElement(locators.get("mobileNumber"));

        WebElement address1 = driver.findElement(locators.get("address1"));
        WebElement address2 = driver.findElement(locators.get("address2"));
        WebElement country = driver.findElement(locators.get("country"));
        WebElement state = driver.findElement(locators.get("state"));
        WebElement city = driver.findElement(locators.get("city"));
        WebElement zip = driver.findElement(locators.get("zipcode"));


        RegisterForm form = ToRegisterForm(path);
        title.click();
        name.sendKeys(form.getName());
        password.sendKeys(form.getPassword());

        days.sendKeys(String.valueOf(form.getDay()));
        months.sendKeys(String.valueOf(form.getMonth()));
        years.sendKeys(String.valueOf(form.getYear()));

        newsletter.click();
        special_offers.click();

        firstname.sendKeys(form.getFirstname());
        lastname.sendKeys(form.getLastname());

        address1.sendKeys(form.getAddress1());
        address2.sendKeys(form.getAddress2());

        company.sendKeys(form.getCompany());
        country.sendKeys(form.getCountry());
        state.sendKeys(form.getState());
        city.sendKeys(form.getCity());
        zip.sendKeys(form.getZip());

        mobileNumber.sendKeys(form.getPhone());
    }


    

}
