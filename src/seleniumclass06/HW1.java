package seleniumclass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /*
    Navigate to http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled
     */
    public static String url= "http://syntaxtechs.com/selenium-practice/bootstrap-iframe.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        WebElement header=driver.findElement(By.xpath("//a[@href='index.php']"));
        String headerText=header.getText();
        Boolean headerIsDisplayed=header.isDisplayed();
        if(headerIsDisplayed){
            System.out.println("Header text is displayed ");
        }else{
            System.out.println("Header text is not displayed");
        }
        WebElement frameTwo=driver.findElement(By.xpath("//iframe[@name='FrameTwo']"));
        driver.switchTo().frame(frameTwo);
        WebElement enrollTodayButton=driver.findElement(By.xpath("//a[text()='Enroll Today']"));
        boolean enrollTodayIsEnabled=enrollTodayButton.isEnabled();
        if(enrollTodayIsEnabled){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
