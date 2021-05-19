package seleniumclass10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarDemo {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.delta.com/");
            driver.manage().window().maximize();
            WebElement calendar=driver.findElement(By.id("input_departureDate_1"));
            calendar.click();

            WebElement dMonth=driver.findElement(By.className("dl-datepicker-month-0"));
            String dMonthText= dMonth.getText();
            WebElement nextButton= driver.findElement(By.xpath("//span[text()='Next']"));
            while(!dMonthText.equals("July")){
                nextButton.click();
                dMonthText=dMonth.getText();
            }

            List<WebElement> departDates= driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0']/tr/td"));
            for (WebElement departDate:departDates
                 ) {
                    if(departDate.getText().equals("17")){
                        departDate.click();
                        break;
                    }
            }

            WebElement rMonth=driver.findElement(By.className("dl-datepicker-month-1"));
            String returnMonthText= rMonth.getText();
            while (!returnMonthText.equals("September")){
                nextButton.click();
                returnMonthText= rMonth.getText();
            }

            List<WebElement> returnDates= driver.findElements(By.xpath("//tbody[@class = 'dl-datepicker-tbody-0']/tr/td"));
            for (WebElement returnDate:returnDates
            ) {
                if(returnDate.getText().equals("3")){
                    returnDate.click();
                    break;
                }
            }
            WebElement doneButton= driver.findElement(By.className("donebutton"));
            doneButton.click();
    }
}
