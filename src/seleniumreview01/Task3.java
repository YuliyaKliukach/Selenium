package seleniumreview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://syntaxtechs.com/selenium-practice/basic-first-form-demo.php");
        driver.findElement(By.cssSelector("input[id='user-message']")).sendKeys("Yuliya");
        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        WebElement text=driver.findElement(By.cssSelector("span#display"));
        String name;
        name= text.getText();
        if(name.equalsIgnoreCase("Yuliya")){
            System.out.println("You are successful");
        }else{
            System.out.println("Try again");
        }

        WebElement sum1=driver.findElement(By.cssSelector("input#sum1"));
        sum1.sendKeys("20");
        WebElement sum2=driver.findElement(By.cssSelector("input#sum2"));
        sum2.sendKeys("40");
        driver.findElement(By.cssSelector("button[onclick*='return']")).click();
        WebElement value=driver.findElement(By.cssSelector("span[id*='value']"));

        if(value.getText().equalsIgnoreCase("60")){
            System.out.println("You are genius");
        }else{
            System.out.println("Try again");
        }
    }
}
