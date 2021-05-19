package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork1 {
    public static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(1000);
        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(1000);
        WebElement monthDD = driver.findElement(By.id("month"));
        Select select = new Select(monthDD);
        List<WebElement> month = select.getOptions();
        Thread.sleep(1000);
        int size = month.size();
        System.out.println("Number of months is "+size);
        if (size >=12) {
            System.out.println("We have all 12 months");
        } else {
            System.out.println("Months number is not correct");
        }

        WebElement daysDD = driver.findElement(By.id("day"));
        Select select2 = new Select(daysDD);
        List<WebElement> days = select2.getOptions();
        Thread.sleep(1000);
        int size2 = days.size();
        System.out.println("Number of days is "+size2);
        if (size2 >=31) {
            System.out.println("We have all 31 days numbers");
        } else {
            System.out.println("Days number is not correct");
        }

        WebElement yearDD = driver.findElement(By.id("year"));
        Select select3 = new Select(yearDD);
        List<WebElement> years = select3.getOptions();
        Thread.sleep(1000);
        int size3 = years.size();
        System.out.println("Number of years is "+size3);
        if (size3 >=115) {
            System.out.println("We have all 115 years numbers");
        } else {
            System.out.println("Years number is not correct");
        }
    }
}
