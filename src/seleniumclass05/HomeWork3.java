package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HomeWork3 {
    /*
    Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com");
        //driver.findElement(By.id("gh-cat")).click();

        WebElement categoriesDD=driver.findElement(By.id("gh-cat"));
        Select select=new Select(categoriesDD);
        List<WebElement> options=select.getOptions();
        for (WebElement option:options
        ) {
            String optionText=option.getText();
            System.out.println(optionText);
        }
        select.selectByValue("58058");
        driver.findElement(By.xpath("//input[@value='Search']")).click();

        WebElement headerText=driver.findElement(By.className("b-pageheader__text"));
        boolean headerTextDisplayes=headerText.isDisplayed();

        if(headerTextDisplayes){
            System.out.println("Header Text is displayed");
        }else{
            System.out.println("Header Text is not displayed");
        }
    }
}
