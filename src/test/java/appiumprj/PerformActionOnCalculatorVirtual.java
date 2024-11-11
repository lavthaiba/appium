package appiumprj;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class PerformActionOnCalculatorVirtual {

	@Test
	public void verifySumOnCalculator() throws MalformedURLException, InterruptedException, URISyntaxException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.0");
		dc.setCapability("appPackage", "uz.pdp.calculator2");
		dc.setCapability("appActivity", "com.example.calculator2.MainActivity");
		//URL url = new URL("http://127.0.0.1:4723/wd/hub");
		URL url  = new URI("http://127.0.0.1:4723/wd/hub").toURL();
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url, dc);
		Thread.sleep(5000);
		
		WebElement seven = driver.findElementById("uz.pdp.calculator2:id/seven");
		seven.click();
		
		driver.findElementById("uz.pdp.calculator2:id/plus").click();
		
		WebElement eight = driver.findElementById("uz.pdp.calculator2:id/eight");
		eight.click();
		
		driver.findElementById("uz.pdp.calculator2:id/equality").click();
		String result = driver.findElementById("uz.pdp.calculator2:id/editLarge").getText();
		
		if(result.equals("15")) {
			
			System.out.println("Test Passed");
		}else {
			System.out.println("Test failed");
		}
		
	}

}
