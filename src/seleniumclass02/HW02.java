package seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW02 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://fb.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Yuliya");
        driver.findElement(By.name("lastname")).sendKeys("Kliukach");
        driver.findElement(By.name("reg_email__")).sendKeys("yuliya@mail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("yuliya@mail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("img._8idr.img")).click();
        Thread.sleep(1000);
        driver.quit();





    }
}
