package ass1W9D4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss1W9D4 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.codingdojo.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000); // waiting for the elements to load and be visible to use

	}

	/**
	 * Test TextField using "Key Up" and "key Down"
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {
		// Find Apply Now Button by Tag and Attribute
		WebElement applyNow = driver.findElement(By.xpath("//a[normalize-space()='Apply Now']"));
		applyNow.click();
//		Thread.sleep(2000);

		// Hold all window handles in array list
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());

		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
//		Thread.sleep(2000);

		// Enter First Name
		WebElement FirstName = driver.findElement(By.cssSelector("#first_name_input"));

		// write text with capital letters, highlight it, and right-click on it
		Actions action = new Actions(driver);
		Action seriesOfActions = action // make a series of actions sequentially
				.moveToElement(FirstName).click().keyDown(FirstName, Keys.SHIFT) // kept press Shift Key in the element
				.sendKeys(FirstName, "Mawaddah") // write text with capital letters in the element
				.keyUp(FirstName, Keys.SHIFT) // stop pressing the Shift Key in the element
				.doubleClick(FirstName) // highlight the text
				.contextClick() // right-click
				.build();

		seriesOfActions.perform();
//		Thread.sleep(5000);

		// close tab window
		driver.close();

		// switch to parent window
		driver.switchTo().window(newTb.get(0));
		System.out.println("Page title of parent window: " + driver.getTitle());
//		Thread.sleep(2000);

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
