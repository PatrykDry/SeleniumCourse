package pl.coderslab.test.locator;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementTest {
    @Test
    public void findElementTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://lms.coderslab.pl/");
        WebElement emailInput = driver.findElement(By.id("username"));
        emailInput.sendKeys("test@tes.pl");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("test");
        passwordInput.submit();
    }
}
