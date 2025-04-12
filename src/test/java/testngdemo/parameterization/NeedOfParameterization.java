package testngdemo.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    @Test
    public void searchOnGoogle() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.className("gLFyf"));
        searchTextBox.sendKeys("Selenium" + "Delhi");
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }

}
