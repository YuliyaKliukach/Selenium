package seleniumclass11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.AccessibleObject;

public class RightAndDoubleClickDemo {
    public static String url = "http://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement rightClickButton= driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions actions=new Actions(driver);
        actions.contextClick(rightClickButton).perform();
        WebElement editOption= driver.findElement(By.xpath("//span[text()='Edit']"));
        //editOption.click();
        actions.click(editOption).perform();
        Alert simpleAlert=driver.switchTo().alert();
        simpleAlert.accept();

        WebElement doubleClickButton= driver.findElement(By.xpath("//button[contains(text(), 'Double-Click')]"));
        actions.doubleClick(doubleClickButton).perform();
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();
    }
}
