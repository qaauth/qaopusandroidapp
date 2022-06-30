package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TC_Test_01 extends BaseClass {

	@Test
	public void testOne() {
		driver.get("https://google.com");
		driver.findElementByName("q").sendKeys("Automation");
		driver.findElementByName("q").sendKeys(Keys.ENTER);
		System.out.println("Compalted test one successfully!");
	}

}
