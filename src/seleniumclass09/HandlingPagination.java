package seleniumclass09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandlingPagination {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.cssSelector("input#btnLogin")).click();

        WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));
        PIM.click();
        Thread.sleep(2000);
        WebElement addEmployee=driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployee.click();
        Thread.sleep(2000);
        WebElement firstNameField= driver.findElement(By.id("firstName"));
        firstNameField.sendKeys("Yuliya");
        WebElement lastNameField=driver.findElement(By.id("lastName"));
        lastNameField.sendKeys("Klyukach");
        WebElement employeeIdField =driver.findElement(By.id("employeeId"));
        String employeeID=employeeIdField.getAttribute("value");
        WebElement saveButton= driver.findElement(By.id("btnSave"));
        saveButton.click();
        WebElement employeeList=driver.findElement(By.linkText("Employee List"));
        employeeList.click();
        boolean flag=true;
        while(flag){
            List<WebElement> tableRows =driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) {
                String rowText=tableRows.get(i).getText();
                if(rowText.contains(employeeID)){
                    flag=false;
                    WebElement checkBox=driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]"));
                    checkBox.click();
                    WebElement deleteButton =driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete= driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                }
            }

            WebElement next=driver.findElement(By.linkText("Next"));
            next.click();
        }

    }
}
