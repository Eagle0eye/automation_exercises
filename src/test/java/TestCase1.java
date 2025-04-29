import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testing.pages.HomePage;

@Test
public class TestCase1 {
    WebDriver driver;
    @BeforeTest
    public void prepare(){
        driver = new EdgeDriver();

    }
    @Test
    public void verifyLoginPage(){

        String data = "/registeredInfo.json";
        String valid;
        valid = new HomePage(driver).navigateToLogin().register(data).fillRegisterForm(data).verifyRegisterForm();
        Assert.assertEquals(valid, "ACCOUNT CREATED!");
    }
    @Test
    public void LogoutPage(){

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
