package pl.coderslab.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckduckgoSearchTest {
    @Test
    public void duckduckgoSearchTest(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        WebElement searchInputBox = driver.findElement(By.name("q"));
        searchInputBox.sendKeys("Google");
        searchInputBox.submit();
        driver.quit();
    }
}
