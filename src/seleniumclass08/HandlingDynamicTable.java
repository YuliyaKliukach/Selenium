package seleniumclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandlingDynamicTable {
    public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Default.aspx";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement username=driver.findElement(By.xpath("//input[@id = 'ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        WebElement password=driver.findElement(By.xpath("//input[contains(@type, 'password')]"));
        password.sendKeys("test");
        WebElement loginButton=driver.findElement(By.xpath("//input[contains(@name, 'login_button')]"));
        loginButton.click();
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr"));
        for (int i = 0; i < rows.size(); i++) {
            String rowText=rows.get(i).getText();
            System.out.println(rowText);
            if(rowText.contains("FamilyAlbum")){
                List<WebElement> checkboxes=driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr/td[1]"));
                checkboxes.get(i-1).click();
                //break;
            }
        }
    }
}
