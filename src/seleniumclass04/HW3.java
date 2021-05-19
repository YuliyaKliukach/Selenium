package seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("");
        driver.findElement(By.cssSelector("input#btnLogin")).click();
        String spanMessage=driver.findElement(By.cssSelector("span#spanMessage")).getText();
        if(spanMessage.equalsIgnoreCase("Password cannot be empty")){
            System.out.println("Span message is correct");
        }else{
            System.out.println("Span message is not correct");
        }

        driver.quit();
    }
}
