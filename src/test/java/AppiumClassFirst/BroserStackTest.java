package AppiumClassFirst;


// curl -u "denemeklazim_ZVRtah:eVYdFLF2M4SjiqKbyzC5"  -X POST "https://api-cloud.browserstack.com/app-automate/upload" \-F "file=@C:\Users\Mehmet\Desktop\mobile_testing\src\test\java\AppiumClassFirst\APP\apidemos.apk"


import java.net.URL;
        import java.util.List;
        import java.net.MalformedURLException;

        import io.appium.java_client.MobileBy;
        import io.appium.java_client.android.AndroidDriver;
        import io.appium.java_client.android.AndroidElement;

        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.openqa.selenium.remote.DesiredCapabilities;

public class BroserStackTest {

    public static String userName = "hakkekerci_zMaN3P";
    public static String accessKey = "aiYT2gsJHAUSSpb4S1CF";

    public static void main(String args[]) throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Samsung Galaxy S8 Plus");
        caps.setCapability("os_version", "7.0");
        caps.setCapability("project", "My First Project");
        caps.setCapability("build", "FirstTest");
        caps.setCapability("name", "Browserstack");
        caps.setCapability("app", "bs://46cb95c2b24aa39c153a95347a34752fa8cd13f8");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);

        System.out.println("driver = " + driver);
        driver.quit();
    }
}
