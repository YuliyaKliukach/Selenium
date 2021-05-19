package seleniumclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    Go to http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php
click on each button and handle the alert accordingly
     */
    public static String url= "http://syntaxtechs.com/selenium-practice/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement alertButton1=driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        alertButton1.click();
        Thread.sleep(2000);
        Alert alert1=driver.switchTo().alert();
        alert1.accept();
        Thread.sleep(2000);

        WebElement alertButton2=driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
        alertButton2.click();
        Thread.sleep(2000);
        Alert alert2=driver.switchTo().alert();
        alert2.dismiss();
        Thread.sleep(2000);

        WebElement alertButton3=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertButton3.click();
        Thread.sleep(2000);
        Alert alert3 =driver.switchTo().alert();
        alert3.sendKeys("Syntax techs");
        Thread.sleep(2000);
        alert3.accept();
    }
}
