package appium_Project;



import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity_3 {
    AndroidDriver<MobileElement> driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", "ManmithaEmulator1");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.google.android.keep");
        caps.setCapability("appActivity", ".activities.BrowseActivity");
        caps.setCapability("noReset", true);
       

     // Instantiation of Appium Driver
        URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer, caps);

    }
    @Test
    public void googleKeep() throws InterruptedException {
        driver.findElementByAccessibilityId("New text note").click();
        Thread.sleep(2000);
        driver.findElementByXPath("//android.widget.EditText[@text = 'Title']").sendKeys("Appium");
        driver.findElementByXPath("//android.widget.EditText[@text = 'Note']").sendKeys("Hello World!");
        driver.findElementByAccessibilityId("Multi-column view").click();
        Thread.sleep(1000);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]").click();
        driver.findElementByAccessibilityId("Open navigation drawer").click();
        String title = driver.findElementByXPath("//android.widget.TextView[@text = 'Appium']").getText();
        String description = driver.findElementByXPath("//android.widget.TextView[@text = 'Hello World!']").getText();
        String remainder = driver.findElementByXPath("//android.widget.TextView[@text = 'Today, 5:00 PM']").getText();
        Assert.assertEquals(title,"Project1");
        Assert.assertEquals(description,"Helloo World!");
        Assert.assertEquals(remainder,"Today, 5:00 PM");

    }
    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}