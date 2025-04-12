package testngdemo.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckHardAssert {

    @Test
    public void verifyLoginSwagLab() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);

        WebElement swagLabLogo = driver.findElement(By.xpath("//div[@class='app_logo']"));
        WebElement productLogo = driver.findElement(By.xpath("//span[@class='title']"));


        Assert.assertFalse(swagLabLogo.isDisplayed(), "SwagLab Logo should displayed......");
        Assert.assertTrue(productLogo.isDisplayed(), "Product Logo should displayed......");
        driver.close();

    }
}
