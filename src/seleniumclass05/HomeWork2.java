package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork2 {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Yuliya");
        driver.findElement(By.name("lastname")).sendKeys("Kliukach");
        driver.findElement(By.name("reg_email__")).sendKeys("yuliya@mail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("yuliya@mail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("123456789");
        WebElement monthDD = driver.findElement(By.id("month"));
        Select select = new Select(monthDD);
        List<WebElement> month = select.getOptions();
        select.selectByIndex(3);
        Thread.sleep(1000);
        WebElement daysDD = driver.findElement(By.id("day"));
        Select select2 = new Select(daysDD);
        List<WebElement> days = select2.getOptions();
        select2.selectByIndex(20);
        Thread.sleep(1000);
        WebElement yearDD = driver.findElement(By.id("year"));
        Select select3 = new Select(yearDD);
        List<WebElement> years = select3.getOptions();
        select3.selectByIndex(35);
        Thread.sleep(1000);
        List<WebElement> optionCheckBoxes=driver.findElements(By.name("sex"));
        Thread.sleep(1000);
        for (WebElement optionCheckBox:optionCheckBoxes) {
            String checkBox= optionCheckBox.getAttribute("value");
            if(checkBox.equalsIgnoreCase("1")){
                Thread.sleep(1000);
                optionCheckBox.click();
                break;
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();

        driver.quit();
    }
}
