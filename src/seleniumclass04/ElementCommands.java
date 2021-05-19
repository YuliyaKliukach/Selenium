package seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://syntaxtechs.com/selenium-practice/basic-radiobutton-demo.php");
        WebElement ageRadioButton=driver.findElement(By.cssSelector("input[value='0 - 5']"));
        boolean isAgeRadioButtonEnabled=ageRadioButton.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);
        boolean isAgeRadioButtonDisplayed=ageRadioButton.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);
        boolean isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println("Before clicking "+isAgeRadioButtonSelected);
        ageRadioButton.click();
        isAgeRadioButtonSelected=ageRadioButton.isSelected();
        System.out.println("After clicking "+isAgeRadioButtonSelected);
    }
}
