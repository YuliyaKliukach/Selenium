package seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;

public class HandlingWithIterator {
    public static String url = "https://www.amazon.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD=driver.findElement(By.id("searchDropdownBox"));
        Select select=new Select(categoriesDD);
        boolean isMultiple=select.isMultiple();
        //System.out.println(isMultiple);
        if(!isMultiple){
            List<WebElement> options = select.getOptions();
            Iterator<WebElement> iterator=options.iterator();
            while (iterator.hasNext()){
                WebElement optionDD=iterator.next();
                String optionText=optionDD.getText();
                System.out.println(optionText);
            }
        }
    }
}
