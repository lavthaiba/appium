package appiumprj;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionOnCalculatorIOS {

    @Test
    public void verifySumOnCalculatorIOS() throws MalformedURLException, InterruptedException {
        
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.0");
        dc.setCapability(MobileCapabilityType.UDID, "your_device_udid");
        dc.setCapability("bundleId", "com.yourcompany.Calculator"); // Replace with your app's bundle ID
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        
        IOSDriver<WebElement> driver = new IOSDriver<WebElement>(url, dc);
        Thread.sleep(2000);
        
        WebElement seven = driver.findElementById("element_id_for_seven"); // Use appropriate locator strategy
        seven.click();
        
        driver.findElementById("element_id_for_plus").click();
        
        WebElement eight = driver.findElementById("element_id_for_eight"); // Use appropriate locator strategy
        eight.click();
        
        driver.findElementById("element_id_for_equality").click();
        String result = driver.findElementById("element_id_for_result").getText(); // Use appropriate locator strategy
        
        if(result.equals("15")) {
            
            System.out.println("Test Passed");
        }else {
            System.out.println("Test failed");
        }
        
        driver.quit();
    }

}
