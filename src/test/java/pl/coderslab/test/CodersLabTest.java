package pl.coderslab.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CodersLabTest {
    @Test
    public void codersLabTest(){

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://duckduckgo.com/");
        driver.get("http://automationpractice.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.manage().window().maximize();
    }
}
