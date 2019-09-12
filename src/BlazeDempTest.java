import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDempTest {

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("THIS IS SETUP");
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(6000);
		driver.close();
	}

	@Test
	public void testDepartureCities() {
		// 1. Enter some value into the text box
			
				WebElement inputBox = driver.findElement(By.id("Choose Your Departure City"));
				WebElement showMessageButton = driver.findElement(
						By.cssSelector("form#get-input button"));
				// - PUSH the button
				showMessageButton.click();
				
				
				
				// ----------------------------------------------
				// 3. Get the actual output from the screen
				WebElement outputBox = driver.findElement(By.id("Choose Your Destination City"));
				String actualOutput = outputBox.getText();
				
				// 4. Check if expected output == actual output
				assertEquals("", actualOutput);
	}

}
