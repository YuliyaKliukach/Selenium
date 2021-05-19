package seleniumclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://facebook.com");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen(); //fullscreen - no toolbar or something else
        driver.navigate().back();

    }
}
