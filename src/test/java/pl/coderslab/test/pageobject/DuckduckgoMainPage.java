package pl.coderslab.test.pageobject;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DuckduckgoMainPage {
    private WebDriver driver;
    public DuckduckgoMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchPhrase(String phraseToSearch){
        WebElement searchInputBox = this.driver.findElement(By.name("q"));
        searchInputBox.clear();
        searchInputBox.sendKeys(phraseToSearch);

    }
    public void clickSearchIcon(){
        WebElement submitButton = this.driver.findElement(
                By.cssSelector("#search_button_homepage")
        );
        submitButton.click();
    }
}
