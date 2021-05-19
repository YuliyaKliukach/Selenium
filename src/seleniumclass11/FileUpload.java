package seleniumclass11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement fileUploadLink= driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile= driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\Yuliya\\Desktop\\test.xlsx");

        WebElement uploadButton =driver.findElement(By.id("file-submit"));
        uploadButton.click();
    }
}
