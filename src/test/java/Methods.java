import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Methods {

    public static void enterValue(By locator, String value) {
        Driver.driver.findElement(locator).sendKeys(value);
    }

    public static void click(By locator){
        Driver.driver.findElement(locator).click();
    }

}
