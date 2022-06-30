package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	AppiumDriver<MobileElement> driver;

	@BeforeTest
	public void setup() throws MalformedURLException {

		try {
			/*DesiredCapabilities caps = new DesiredCapabilities();
			// caps.setCapability("platformName", "ANDROID");
			// caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator");
			caps.setCapability(MobileCapabilityType.UDID, "36482ab");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
			// caps.setCapability(MobileCapabilityType.APP, "APK");
			caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");*/
			
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability("no", true);
			capabilities.setCapability("newCommandTimeout", 100000);
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, 9);
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.authbridge.addressverification");
			capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
					"com.authbridge.addressverification.activity.SplashActivity");
			// capabilities.setCapability(MobileCapabilityType.APP,"/home/raju.yadav/Downloads/DataFile/Opus_UAT_Latest_2.0.6.apk");
			capabilities.setCapability("autoGrantPermissions", "true");
			capabilities.setCapability("noRest", true);

			URL url = new URL("http:127.0.0.1:4723/wd/hub");
			driver = new AppiumDriver<MobileElement>(url,capabilities);
			//driver = new AndroidDriver<MobileElement>(url,caps);

		} catch (Exception exp) {
			System.out.println("Cause is : " + exp.getCause());
			System.out.println("Message is : " + exp.getMessage());
			exp.printStackTrace();
		}

	}

	@Test
	public void sampleTest() {
		System.out.println("I am inside sample Test");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}

}
