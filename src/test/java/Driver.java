import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    public static WebDriver driver;

    private static void initializeChromeDriver(){

        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win\\chromedriver.exe");

        }

    public static WebDriver getChromeDriver(){
        initializeChromeDriver();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
    }
}
