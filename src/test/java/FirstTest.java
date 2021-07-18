import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.layertree.model.PictureTile;

import java.time.Duration;

public class FirstTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://a.testaddressbook.com/sign_in/");

        // First Test
        driver.findElement(By.id("session_email")).sendKeys("chuchundra_91@mail.ru");
        driver.findElement(By.id("session_password")).sendKeys("1111");
        driver.findElement(By.name("commit")).click();

        //Second Test

        driver.findElement(By.cssSelector("a[href=\"/addresses\"]")).click();
        driver.findElement(By.cssSelector("a[href=\"/addresses/new\"]")).click();
        driver.findElement(By.id("address_first_name")).sendKeys("Dariya");
        driver.findElement(By.id("address_last_name")).sendKeys("Maslovskaya");
        driver.findElement(By.id("address_street_address")).sendKeys("Lidskaya");
        driver.findElement(By.id("address_secondary_address")).sendKeys("7");
        driver.findElement(By.id("address_city")).sendKeys("Grodno");
        driver.findElement(By.id("address_state")).click();
        driver.findElement(By.cssSelector("option[value='AZ']")).click();
        driver.findElement(By.id("address_zip_code")).sendKeys("230019");
        driver.findElement(By.id("address_country_us")).click();
        driver.findElement(By.id("address_birthday")).sendKeys("14.04.1991");
        driver.findElement(By.id("address_color")).sendKeys("000");
        driver.findElement(By.id("address_age")).sendKeys("30");
        driver.findElement(By.id("address_website")).sendKeys("https://www.google.by/");
        driver.findElement(By.id("address_phone")).sendKeys("375291111111");
        driver.findElement(By.id("address_interest_read")).click();
        driver.findElement(By.id("address_note")).sendKeys("Pets - 2 dogs. Tommy. Sara.");
        driver.findElement(By.cssSelector("input[value='Create Address']")).click();

        // Third Test

        driver.findElement(By.cssSelector("a[data-test='edit']")).click();
        driver.findElement(By.id("address_last_name")).sendKeys("-Kalvina");
        driver.findElement(By.id("address_note")).sendKeys("Husband Roman");
        driver.findElement(By.cssSelector("input[value='Update Address']")).click();

        //Fourth Test

        driver.findElement(By.cssSelector("a[data-test='list']")).click();
        driver.findElement(By.cssSelector("a[data-confirm=\"Are you sure?\"]")).click();
        driver.switchTo().alert().accept();

        //Fifth Test

        //driver.findElement(By.cssSelector("a[data-method='delete']")).click(); - возможен такой вариант?
        driver.findElement(By.cssSelector("a[data-test=\"sign-out\"]")).click();


        Thread.sleep(5000);

        driver.close();
        driver.quit();

    }

}
