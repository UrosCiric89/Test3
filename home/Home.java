package home;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	public static final String URL = "https://www.saucedemo.com/";
	
	
	public static void clickLogin(WebDriver driver) {
		driver.findElement(By.name("login-button")).click();
	}


	public static void inputUserName(WebDriver driver, String string) {
		
		
	}


	public static void inputPassword(WebDriver driver, String string) {
		
		
	}
	
	
	

}
