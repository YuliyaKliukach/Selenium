package seleniumreview03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandling {
    public static String url = "https://swagger.io/tools/swaggerhub/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String homepageHandle=driver.getWindowHandle();
        //System.out.println(homepageHandle);
        WebElement link1= driver.findElement(By.xpath("//a[@href='https://bitbar.com/?utm_medium=referral&utm_source=swagger.io&utm_campaign=footer']"));
        link1.click();
        //Thread.sleep(10000);
        Set<String> allhandles=driver.getWindowHandles();
        Iterator <String> iterator= allhandles.iterator();
        homepageHandle= iterator.next();
        String link1handle= iterator.next();
        System.out.println(homepageHandle);
        System.out.println(link1handle);
        driver.switchTo().window(link1handle);
        WebElement youtubeButton=driver.findElement(By.xpath("//a[@href='https://www.youtube.com/user/BitbarChannel/']"));
        youtubeButton.click();
        String link2handle = null;
        allhandles=driver.getWindowHandles();
        iterator= allhandles.iterator();
        int handlenumber=2;
        String value=null;
        for (int i = 0; iterator.hasNext(); i++) {
            value= iterator.next();
            if(i==handlenumber){
                link2handle=value;
                System.out.println(link2handle);
                break;
            }
        }

        Thread.sleep(5000);
        driver.switchTo().window(homepageHandle);
        Thread.sleep(5000);
        driver.switchTo().window(link2handle);
        Thread.sleep(5000);
        driver.switchTo().window(link1handle);
    }
}
