package in.magneticautomation.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstScript_Test {

	@Test(description="Title Test of Google")
	public void titleTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		Assert.assertEquals(driver.getTitle(), "Google");
		driver.quit();
	}
}
