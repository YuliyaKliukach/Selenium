package seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class SimpleWindowHandling {
    public static String url="https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //WebDriver driver1 = new ChromeDriver();
        driver.get(url);
        //driver1.get(url);
        String mainPageHandle=driver.getWindowHandle();
        System.out.println(mainPageHandle);
        WebElement helpLink=driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowHandles=driver.getWindowHandles(); //will automatically return LinkedHashSet
        System.out.println(allWindowHandles.size());
        Iterator<String> allWindows=allWindowHandles.iterator();
        mainPageHandle = allWindows.next();
        String childHandle=allWindows.next();
        System.out.println(childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainPageHandle);
        driver.close();
    }
}
