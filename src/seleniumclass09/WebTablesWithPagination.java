package seleniumclass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTablesWithPagination {
    public static String url = "http://syntaxtechs.com/selenium-practice/table-pagination-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@class ='table table-hover']/tbody/tr"));
        WebElement nextButton= driver.findElement(By.xpath("//a[@class ='next_link']"));
        boolean flag=true;
        while(flag) {
            for (WebElement tableRow : tableRows) {
                String rowText = tableRow.getText();
                if(rowText.contains("Archy J")) {
                    System.out.println(rowText);
                    flag=false;
                    break;
                }
            }
            nextButton.click();
        }
    }
}
