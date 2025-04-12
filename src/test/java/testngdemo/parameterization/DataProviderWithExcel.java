package testngdemo.parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {

    @DataProvider(name = "verify")
    public Object[][] dataCheck() throws IOException {
           Object[][] arrObj = getExcelData("E:\\SDET_Lectures\\CheckTest.xlsx", "TestData");
           return arrObj;
    }

    public String[][] getExcelData(String filePath, String sheetName) throws IOException {
        FileInputStream fp = new FileInputStream(filePath); // Accessing the file [Also Handle the exception]
        XSSFWorkbook wb = new XSSFWorkbook(fp); // Because we have to access excel data file [Also Handle the exception]
        XSSFSheet sheet = wb.getSheet(sheetName); // Access the sheet [We can't create object of this so we have to access by getSheet]

        XSSFRow row = sheet.getRow(0); // Total no. of rows access
        int noOfRows = sheet.getPhysicalNumberOfRows(); // Physical no. of rows [Only rows that consists data]
        int noOfColumns = row.getLastCellNum(); // Physical no. of column

        Cell cell;  // Reference variable to get the data

        String [][] data = new String[noOfRows-1][noOfColumns]; // For storing data in rows and columns

        // For fetching/read the data one by one we use this:

        for (int i = 1; i < noOfRows ; i++) {
            for (int j = 0; j < noOfColumns ; j++) {
                row = sheet.getRow(i);
                cell = row.getCell(j);
                data[i-1][j] = cell.getStringCellValue();
            }

        }
                return data;
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

        Thread.sleep(3000);
    }
}
