package seleniumreview01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement userNameTextBox=driver.findElement(By.id("user-name"));
        userNameTextBox.sendKeys("standard_user");
        WebElement passwordTextBox=driver.findElement(By.id("password"));
        passwordTextBox.sendKeys("secret_sauce");
        driver.findElement(By.name("login-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("inventory_item_name")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement menuButton=driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("ABOUT")).click();
        //Thread.sleep(5000);
        String title=driver.getTitle();
        if(title.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs")){
            System.out.println("Booom it is correct one");
        }else{
            System.out.println("You have failed, try again");
        }

        driver.navigate().back();
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("checkout")).click();
        Thread.sleep(4000);
        //driver.findElement(By.id("react-burger-menu-btn")).click();
        menuButton=driver.findElement(By.id("react-burger-menu-btn"));
        menuButton.click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("LOG")).click();

    }
}
