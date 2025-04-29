package testing.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testing.register.RegisterForm;

import java.util.Map;

import static testing.register.RegisterMapper.ToRegisterForm;
import static util.LocatorLoader.loadLocators;

public class RegisterPage extends BasePage {
    private final Map<String, By> locators = loadLocators("/registerPage.json");
    private final Map<String, By> validators = loadLocators("/validators/register.json");


    public RegisterPage(WebDriver driver) {
        super(driver);
    }



    public RegisterPage fillRegisterForm(String path) {
        // Get WebElements Links
        RegisterForm form = ToRegisterForm(path);

        // Initialize the WebElements using locators
        driver.findElement(locators.get("title")).click();
        driver.findElement(locators.get("name")).sendKeys(form.getName());
        driver.findElement(locators.get("password")).sendKeys(form.getPassword());

        selectValue(locators.get("day")).selectByValue(form.getDay());
        selectValue(locators.get("month")).selectByValue(form.getMonth());
        selectValue(locators.get("year")).selectByValue(form.getYear());

        driver.findElement(locators.get("newsletter")).click();
        driver.findElement(locators.get("special_offers")).click();

        driver.findElement(locators.get("firstname")).sendKeys(form.getFirstname());
        driver.findElement(locators.get("lastname")).sendKeys(form.getLastname());

        driver.findElement(locators.get("company")).sendKeys(form.getCompany());


        driver.findElement(locators.get("address1")).sendKeys(form.getAddress1());
        driver.findElement(locators.get("address2")).sendKeys(form.getAddress2());

        selectValue(locators.get("country")).selectByValue(form.getCountry());
        driver.findElement(locators.get("state")).sendKeys(form.getState());
        driver.findElement(locators.get("city")).sendKeys(form.getCity());
        driver.findElement(locators.get("zipcode")).sendKeys(form.getZipcode());
        driver.findElement(locators.get("mobileNumber")).sendKeys(form.getPhone());
        driver.findElement(locators.get("submit")).click();

        return this;
    }



    private Select selectValue(By locator) {
        WebElement dropdown = driver.findElement(locator);
        return new Select(dropdown);
    }
}
