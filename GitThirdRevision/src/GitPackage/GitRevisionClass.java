package GitPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitRevisionClass {

	@Test
	public void test() {
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Firefox Nightly\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("test@test.com");
	}
}
