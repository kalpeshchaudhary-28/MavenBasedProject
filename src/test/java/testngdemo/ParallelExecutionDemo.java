package testngdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionDemo {

    @Test
    public void checkCognizant() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.cognizant.com/in/en");
        driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
    }

    @Test
    public void checkAmazon() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void checkFlipkart() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    }

}
