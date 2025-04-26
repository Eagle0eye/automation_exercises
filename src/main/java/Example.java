import org.openqa.selenium.By;
import testing.locators.RegisterLocators;

import java.util.Map;


public class Example {
    public static void main(String[] args) {
        Map<String, By> locators = new RegisterLocators().formLocators();
        for (Map.Entry<String, By> entry : locators.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getClass());
        }
    }
}
