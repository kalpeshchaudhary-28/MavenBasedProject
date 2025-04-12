package testngdemo.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SimpleDataProvider {

    @DataProvider(name = "verify")
    public Object[][] dataCheck(){
        return new Object[][]{
                {"Delhi", "Selenium"}, {"Mumbai", "Java"}, {"Noida", ".Net"}
        };
    }

    @Test(dataProvider = "verify")
    public void searchOnGoogle(String courseName, String cityName) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.className("gLFyf"));
        searchTextBox.sendKeys(courseName + " " + cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

        driver.close();
    }
}
