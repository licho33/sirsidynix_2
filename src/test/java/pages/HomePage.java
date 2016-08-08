package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	
	WebDriver driver;


	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public void goToHomePage(String homePage) 
	{
		driver.get(homePage);
	}
	
	public void typeTextToSearch(String textToSearch)
	{
	
		driver.findElement(By.name("search_block_form")).sendKeys(textToSearch);
		
	}
	
	public void clickSearchButton()
	{
		driver.findElement(By.name("submit")).click();
	}

}
