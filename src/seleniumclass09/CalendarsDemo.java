package seleniumclass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.SQLOutput;
import java.util.List;

public class CalendarsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

        WebElement leaveButton= driver.findElement(By.linkText("Leave"));
        leaveButton.click();
        WebElement fromDateDD=driver.findElement(By.id("calFromDate"));
        fromDateDD.click();
        WebElement monthDD=driver.findElement(By.className("ui-datepicker-month"));
        Select month=new Select(monthDD);
        month.selectByVisibleText("Jul");

        List<WebElement> fromDates=driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        System.out.println(fromDates.size());
        for (WebElement fromDate:fromDates
             ) {
            if(fromDate.getText().equals("29")){
                fromDate.click();
                break;
            }
        }
    }
}
