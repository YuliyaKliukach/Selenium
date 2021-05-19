package seleniumclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW01 {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */

    public static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeButton= driver.findElement(By.xpath("//button[text()='Remove']"));
        removeButton.click();
        WebDriverWait wait=new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        WebElement textMessage=driver.findElement(By.id("message"));
        System.out.println(textMessage.getText());
        WebElement enableButton=driver.findElement(By.xpath("//button[text()='Enable']"));
        enableButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        WebElement enabledText=driver.findElement(By.id("message"));
        System.out.println(enabledText.getText());
        WebElement textBox=driver.findElement(By.xpath("//input[@type='text']"));
        Boolean textBoxisEnabled=textBox.isEnabled();
        System.out.println(textBoxisEnabled);
        textBox.sendKeys("Hello");
        WebElement disableButton=driver.findElement(By.xpath("//button[text()='Disable']"));
        disableButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
        WebElement disabledText=driver.findElement(By.id("message"));
        System.out.println(disabledText.getText());
        textBoxisEnabled=textBox.isEnabled();
        System.out.println(textBoxisEnabled);
        driver.quit();
    }
}
