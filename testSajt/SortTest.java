package testSajt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import home.Home;
import home.Login;
import home.Sortiranje;



public class SortTest {
	
private static WebDriver driver;
	
	@BeforeClass
	public void createDriver() {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Urke i Boka\\Desktop\\Chromedriver\\chromedriver.exe");
	   driver = new ChromeDriver();
	}
	@Test
	public void sortTest() {
		driver.navigate().to(Home.URL);
		driver.manage().window().maximize();
		
		Home.inputUserName(driver,"standard_user");
		Home.inputPassword(driver,"secret_sauce");
		Home.clickLogin(driver);
		Sortiranje.sort(driver);
	}

}
