



package pl.coderslab.test.pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuckduckgoSearchPageObjectTest {
    @Test
    public void duckduckgoSearchTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.duckduckgo.com/");
        DuckduckgoMainPage duckduckgoMainPage = new DuckduckgoMainPage(driver);

        duckduckgoMainPage.enterSearchPhrase("W pustyni i w puszczy");
        duckduckgoMainPage.enterSearchPhrase("Dziala chyba");
        duckduckgoMainPage.clickSearchIcon();
        // driver.quit();
    }
}














//package pl.coderslab.test.pageobject;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class DuckduckgoSearchPageObjectTest {
//    @Test
//    public void duckduckgoSearchTest(){
//        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://duckduckgo.com/");
//
//
//        //
//    }
//}
