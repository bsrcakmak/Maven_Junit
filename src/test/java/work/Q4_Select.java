package work;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Q4_Select {
   /*
1-https://rahulshettyacademy.com/AutomationPractice/ adresine gidin
2-Dropdown Example menüsünün görünür olduğunu doğrulayın.
3-Option3 ü seçin.
4-Option3 ün seçili olduğunu doğrulayın.
   */
    WebDriver driver;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
    public void test(){
        //1-https://rahulshettyacademy.com/AutomationPractice/ adresine gidin
        driver.get("https://rahulshettyacademy.com/AutomationPractice");

        //2-Dropdown Example menüsünün görünür olduğunu doğrulayın.
        WebElement dropdownMenu = driver.findElement(By.id("dropdown-class-example"));
        Assert.assertTrue(dropdownMenu.isDisplayed());

        //3-Option3 ü seçin.
        Select option3 = new Select(dropdownMenu);
        option3.selectByValue("option3");

        //4-Option3 ün seçili olduğunu doğrulayın.
        //1.yol;
        String selectedOption = option3.getFirstSelectedOption().getText();
        String expectedOption = "Option3";
        Assert.assertEquals(expectedOption,selectedOption);
        //2.yol;
        //Assert.assertTrue(dropdownMenu.getAttribute("value").equalsIgnoreCase("option3"));
    }





}
