package seleniumreview04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class commonMethods {

    public static WebElement FindElementByXpath(WebDriver driver, String path){
        return driver.findElement(By.xpath(path));
    }
}
