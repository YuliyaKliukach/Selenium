package seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/index.php");
        WebElement startPractisingLink=driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPractisingLink.click();
        Thread.sleep(1000);
        WebElement simpleFormDemo=driver.findElement(By.xpath("(//a[text() = 'Simple Form Demo'])[2]"));
        simpleFormDemo.click();
        Thread.sleep(1000);
        WebElement enterText=driver.findElement(By.cssSelector("input[placeholder ^='Please enter']"));
        enterText.sendKeys("Hello, Syntax!");
        Thread.sleep(1000);
        WebElement showMessage=driver.findElement(By.cssSelector("button[onclick *='show']"));
        showMessage.click();
    }
}
