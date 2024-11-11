package appiumprj;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallOnRealDevice {
	
	@Test
	
	public void installAppOnRealDevice() throws MalformedURLException {
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.0");
		
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
		
		dc.setCapability(MobileCapabilityType.APP, "E:\\calculator2.apk");
		
		URL url = new URL("http://127.0.0.01:4723/wd/hub");
		
		AndroidDriver driver = new AndroidDriver(url, dc);
		
		driver.quit();
	}

}
