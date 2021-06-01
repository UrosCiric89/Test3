package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
	public static final String URL = "https://www.saucedemo.com/";
	public static final String TXTUSERNAME_XPATH ="//*[@id=\"user-name\"]";
	public static final String SORT_XPATH ="//*[@id=\"header_container\"]/div[2]/div[2]/span/select";
	
	public static void inputUsername(WebDriver driver, String username) {
		driver.findElement(By.xpath(TXTUSERNAME_XPATH)).sendKeys(username);		
	}
	public static void inputPassword(WebDriver driver, String password) {
		driver.findElement(By.name("password")).sendKeys(password);		
	}
	
	public static void login(WebDriver driver) {
		driver.findElement(By.name("login-button")).click();
	}
	public static void sort(WebDriver driver) {
		driver.findElement(By.xpath(SORT_XPATH)).click();
	}
	
	

}
