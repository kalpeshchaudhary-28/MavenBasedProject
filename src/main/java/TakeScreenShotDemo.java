import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TakeScreenShotDemo {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("E:\\SDET_Lectures\\ScreenShotsCheck\\Checkss" + timestamp() + ".png");
        FileUtils.copyFile(f, dest);

        driver.close();
    }

    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}
