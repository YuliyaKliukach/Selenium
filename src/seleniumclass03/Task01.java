package seleniumclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_username']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("test");
        driver.findElement(By.xpath("//input[contains(@name, 'login_button')]")).click();
        driver.findElement(By.xpath("//a[contains(text(), 'Logout')]")).click();
        driver.quit();

    }
}
