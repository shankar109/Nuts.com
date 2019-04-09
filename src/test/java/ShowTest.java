import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ShowTest {

protected WebDriver driver;
	
	@Test
	public void homePage() throws MalformedURLException {
	
		/*System.setProperty("webdriver.chrome.driver", "c:\\your\\path\\to\\chromedriver.exe");*/
		//driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");
        //options.addArguments("--start-maximized");
        //options.addArguments("--start-fullscreen");
        driver = new RemoteWebDriver(new URL("http://seleniumhub:4444/wd/hub"), options);
		driver.get("https://www.shoes.co.uk/register");
		driver.navigate().refresh();
		driver.quit();
	}
	
	@Test
	public void registerPage() throws MalformedURLException {
		
		//System.setProperty("webdriver.chrome.driver", "c:\\your\\path\\to\\chromedriver.exe");
		//driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--headless");
       // options.addArguments("--start-maximized");
       // options.addArguments("--start-fullscreen");
        driver = new RemoteWebDriver(new URL("http://seleniumhub:4444/wd/hub"), options);
		driver.get("https://www.shoes.co.uk/register");
		driver.manage().window().maximize();
		driver.findElement(By.id("email_address_login")).sendKeys("shaggie_wolf34@yahoo.com");
		driver.findElement(By.id("password_login")).sendKeys("aiuCH5Pr");
		driver.findElement(By.cssSelector("#login_form > div:nth-child(4) > div > input")).click();
		driver.quit();
	}

	@Test
	public void runSysOut() {

		System.out.println("I love this game");
	}

}
