package day13;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

public class C03_NullPointerException {

    /*
    *** NullPointerException
Degiskenleri oluşturup instantiate etmediğimizde alırız(new kelimesini kullanmadigimizda)
Ornegin WebDriver driver; deyip = new ChromeDriver() demezisek null pointer exception aliriz
    *** Solution:
Degiskeni instantiate et
     */
    /*
    NullPointerException
When a variable is created, but not instantiated, when pointer does not show any value then we get NullPointerException.
It is common to initialize the Driver, they we get the extaction. Driver driver; but never use driver=new ChromeDriver()
For example, in my page object model, I create page objects in test classes but when I forgot to use new keyword to instantiate, then I get the exception
Solution:
Instantiate the variable
     */

    WebDriver driver; // eleman instantiate edilmedigi icin hata verir, yani new keywordu ile tanimlanmadi
    Faker faker;

    @Test
    public void nullPointerExceptionTest() {

        driver = new ChromeDriver(); // exception cozulur bu sekilde

        driver.get("https://www.techproeducation.com"); // java.lang.NullPointerException

    }

    @Test
    public void nullPointerExceptionTest2() {

        faker = new Faker(); // exception cozulur bu sekilde

        System.out.println(faker.name().fullName());  // java.lang.NullPointerException
    }
}