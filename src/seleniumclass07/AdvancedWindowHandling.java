package seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AdvancedWindowHandling {
    public static String url="http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageWindow = driver.getWindowHandle();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement instagramButton=driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton=driver.findElement(By.linkText("Like us On Facebook"));
        WebElement instaAndButton=driver.findElement(By.linkText("Follow Instagram & Facebook"));
        instagramButton.click();
        facebookButton.click();
        instaAndButton.click();

        Set<String> allWindowHandles=driver.getWindowHandles();
        System.out.println(allWindowHandles.size());

        Iterator<String> iterator=allWindowHandles.iterator();
        while (iterator.hasNext()){
            String handle=iterator.next();
            if(!handle.equals(mainPageWindow)) {
                driver.switchTo().window(handle);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(mainPageWindow);
        instagramButton.click();

    }
}
