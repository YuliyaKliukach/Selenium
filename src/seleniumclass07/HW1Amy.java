package seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HW1Amy {

    public static String url="https://demoqa.com/browser-windows";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageWindowHandle = driver.getWindowHandle();
        WebElement tabButton = driver.findElement(By.id("tabButton"));
        tabButton.click();
        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String> i = allWindowHandles.iterator();
        while (i.hasNext()){
            i.next();
            driver.switchTo().window(i.next());
            String tabWindowText = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
            System.out.println(tabWindowText);
            driver.close();
        }
        driver.switchTo().window(mainPageWindowHandle);
        WebElement windowButton = driver.findElement(By.id("windowButton"));
        windowButton.click();
        Set<String> newWindowHandles = driver.getWindowHandles();
        Iterator<String> windowHandles = newWindowHandles.iterator();
        windowHandles.next();
        driver.switchTo().window(windowHandles.next());
        String newWindowText = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
        System.out.println(newWindowText);
        driver.close();
        driver.switchTo().window(mainPageWindowHandle);
        WebElement windowMsgButton = driver.findElement(By.id("messageWindowButton"));
        windowMsgButton.click();
        Set<String> lastWindowHandles = driver.getWindowHandles();
        Iterator<String> lastWindowHandle = lastWindowHandles.iterator();
        lastWindowHandle.next();
        driver.switchTo().window(lastWindowHandle.next());
}
}
