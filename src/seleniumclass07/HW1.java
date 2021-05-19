package seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.concurrent.TimeUnit;

public class HW1 {
    /*
    Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify the title is displayed
Print out the title of the all pages
     */

    public static String url= "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageWindow = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement tabButton=driver.findElement(By.id("tabButton"));
        WebElement windowButton= driver.findElement(By.id("windowButton"));
        WebElement messageWindowButton= driver.findElement(By.id("messageWindowButton"));

        tabButton.click();
        windowButton.click();
        messageWindowButton.click();

        Set<String> allWindowHandles=driver.getWindowHandles();
        Iterator<String> iterator=allWindowHandles.iterator();
        while (iterator.hasNext()){
            String handle=iterator.next();
            String title=driver.getTitle();
            System.out.println(title);

        }

    }
}
