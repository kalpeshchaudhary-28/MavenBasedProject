package testngdemo.basicoftestng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCheck {

    public static WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void closed(){
        driver.close();
    }


    @Test(groups = "smoke")
    public void checkAmazon() throws InterruptedException {
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @Test
    public void checkFlipkart() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @Test(groups = "smoke")
    public void checkRedTape() throws InterruptedException {
        driver.get("https://redtape.com/collections/footwear");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


}
