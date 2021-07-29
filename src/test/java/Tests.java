import org.junit.jupiter.api.*;
import org.openqa.selenium.By;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Tests extends Before {

    @Test
    @Order(1)
    @DisplayName("Вход в систему")
    public void login() {
        Methods.enterValue(By.id("session_email"), ("Chuchundra_91@mail.ru"));
        Methods.enterValue(By.id("session_password"), ("1111"));
        Methods.click(By.name("commit"));
    }

    @Test
    @Order(2)
    @DisplayName("Создание нового адреса")
    public void addAddress() {
        Methods.click(By.cssSelector("a[href=\"/addresses\"]"));
        Methods.click(By.cssSelector("a[href=\"/addresses/new\"]"));
        Methods.enterValue(By.id("address_first_name"), ("Dariya"));
        Methods.enterValue(By.id("address_last_name"), ("Maslovskaya"));
        Methods.enterValue(By.id("address_street_address"), ("Lidskaya"));
        Methods.enterValue(By.id("address_secondary_address"), ("7"));
        Methods.enterValue(By.id("address_city"), ("Grodno"));
        Methods.click(By.id("address_state"));
        Methods.click(By.cssSelector("option[value='AZ']"));
        Methods.enterValue(By.id("address_zip_code"), ("230019"));
        Methods.click(By.id("address_country_us"));
        Methods.enterValue(By.id("address_birthday"), ("14.04.1991"));
        Methods.enterValue(By.id("address_color"), ("000"));
        Methods.enterValue(By.id("address_age"), ("30"));
        Methods.enterValue(By.id("address_website"), ("https://www.google.by/"));
        Methods.enterValue(By.id("address_phone"), ("375291111111"));
        Methods.click(By.id("address_interest_read"));
        Methods.enterValue(By.id("address_note"), ("Pets - 2 dogs. Tommy. Sara."));
        Methods.click(By.cssSelector("input[class=\"btn btn-primary\"]"));

    }

    @Test
    @Order(3)
    @DisplayName("Редактирование существующего адреса")
    public void editing() {
        Methods.click(By.cssSelector("a[data-test='edit']"));
        Methods.enterValue(By.id("address_last_name"), ("-Kalvina"));
        Methods.enterValue(By.id("address_note"), ("Husband Roman"));
        Methods.click(By.cssSelector("input[value='Update Address']"));
    }

    @Test
    @Order(4)
    @DisplayName("Удаление адреса")
    public void deletion() {
        Methods.click(By.cssSelector("a[data-test='list']"));
        Methods.click(By.cssSelector("a[data-confirm=\"Are you sure?\"]"));
        Driver.driver.switchTo().alert().accept();
    }

    @Test
    @Order(5)
    @DisplayName("Выход из системы")
    public void singOut() {
        Methods.click(By.cssSelector("a[data-test=\"sign-out\"]"));
    }


}
