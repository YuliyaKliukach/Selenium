package seleniumclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticWebTable {
    public static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        List<WebElement> rowData=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));
        System.out.println(rowData.size());

        Iterator<WebElement> iterator=rowData.iterator();
        while(iterator.hasNext()){
            WebElement row=iterator.next();
            String rowText=row.getText();
            System.out.println(rowText);
        }
        List<WebElement> columnsData=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(columnsData.size());

        for (WebElement coldata:columnsData
             ) {
            System.out.print(coldata.getText()+" ");
        }
    }
}
