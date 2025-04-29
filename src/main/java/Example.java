import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import testing.pages.HomePage;

import java.util.List;


public class Example {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://automationexercise.com/");
        List<WebElement> allH2Elements = driver.findElements(By.tagName("h2"));
        for (WebElement h2 : allH2Elements) {
            System.out.println(h2.getText());
        }

//        boolean x = new HomePage(driver).scrollDownWithoutArrow().verifySUBSCRIPTIONisVisible();
//        System.out.println("X: " + x);
         }
}
