package seleniumclass10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeyes {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username = driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_username']"));
        username.sendKeys("Tester", Keys.TAB);
        WebElement password = driver.findElement(By.xpath("//input[contains(@type, 'password')]"));
        password.sendKeys("test", Keys.ENTER);
    }
}
