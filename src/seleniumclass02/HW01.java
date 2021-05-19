package seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Yuliya");
        driver.findElement(By.name("customer.lastName")).sendKeys("Kliukach");
        driver.findElement(By.name("customer.address.street")).sendKeys("Street");
        driver.findElement(By.id("customer.address.city")).sendKeys("Philly");
        driver.findElement(By.id("customer.address.state")).sendKeys("PA");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("19116");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("+124356789");
        driver.findElement(By.id("customer.ssn")).sendKeys("123-456-489");
        driver.findElement(By.name("customer.username")).sendKeys("yk");
        driver.findElement(By.id("customer.password")).sendKeys("123456");
        driver.findElement(By.id("repeatedPassword")).sendKeys("123456");
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
