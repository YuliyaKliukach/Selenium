package seleniumreview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.bbc.com/");
        driver.findElement(By.xpath("//span[contains(text(), 'Sign')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'Register now')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[contains(text(), 'over')]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name, 'dateOfBirthDay')]")).sendKeys("20");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name, 'dateOfBirthMonth')]")).sendKeys("March");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[contains(@name, 'dateOfBirthYear')]")).sendKeys("1987");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()= 'Continue']")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
