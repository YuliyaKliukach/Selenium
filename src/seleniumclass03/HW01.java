package seleniumclass03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW01 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        driver.manage().window().maximize();
        WebElement startPractisingLink=driver.findElement(By.xpath("//a[starts-with(@id, 'btn_ba')]"));
        startPractisingLink.click();
        WebElement simpleFormDemo=driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        Thread.sleep(2000);
        simpleFormDemo.click();
        WebElement enterText=driver.findElement(By.xpath("//input[contains(@placeholder, 'Please enter your Message')]"));
        enterText.sendKeys("Hello, Syntax!");
        Thread.sleep(2000);
        WebElement showMessage=driver.findElement(By.xpath("//button[starts-with(@onclick,'show')]"));
        showMessage.click();
        Thread.sleep(2000);
        driver.quit();

    }
}
