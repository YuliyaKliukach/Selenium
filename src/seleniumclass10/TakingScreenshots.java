package seleniumclass10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_username']"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.xpath("//input[contains(@type, 'password')]"));
        password.sendKeys("test", Keys.ENTER);

        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE); // screenshot is taken

        try {
            FileUtils.copyFile(sourceFile, new File("screenshots/Smartbear/adminLogin.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
