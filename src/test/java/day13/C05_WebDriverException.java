package day13;

import org.junit.Test;
import utilities.TestBase;

public class C05_WebDriverException extends TestBase {

    /*
      ***  WebDriverException ***
    Driver versiyonları ve browser versiyonları ayni veya yakin olmadiginda alinir
    Driver(Browser) kapattikdan sonra tekrar kullanmak istediğiniz durumlarda alınabilir.
      *** Solution ***
    Framework designinin guzel kurulmuş olması gerekir, ornegin Driver sinifinda birden farza driver.quit() olmamali
     */

    /*
      *** WebDriverException ***
    When you close the browser, but still want to use that in correctly
    When the versions of the driver and browsers are not compatible
      *** Solution ***
    Your design should be good. We should use singleton Driver to prevent this exception
    Keep drivers up to date that is compatible with the  browser version
     */


    @Test
    public void webDriverExceptionTest() {


    }
}
