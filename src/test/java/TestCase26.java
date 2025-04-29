import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class TestCase26 {
    private WebDriver driver;
    @BeforeTest
    public void tearUp() {
        driver = new EdgeDriver();
        driver.manage().window().fullscreen();
    }

    @Test
    public void verifyScrollWithoutArrows() {


    }


    @AfterTest
    public void tearDown() {

    }

}
