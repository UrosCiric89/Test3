package home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Sortiranje {
	
	public static final String URL = "https://www.saucedemo.com/inventory.html/";
	public static final String SORT_XPATH ="//*[@id=\"header_container\"]/div[2]/div[2]/span/select";
	
	
	
	public static void sort(WebDriver driver) {
		Select select = new Select(driver.findElement(By.xpath(SORT_XPATH)));
		select.selectByIndex(2);
	}
	
	
}
