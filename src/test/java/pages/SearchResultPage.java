package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {

	WebDriver driver;
	
	@FindBy (id = "edit-keys")
	private WebElement searchForm;
	
	@FindBy (id = "edit-submit--2")
	private WebElement searchSubmit;
	
	String pageTitle;
	
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public String searchResults()
	{
		return null;
	}
	
	public void clickOnSecondResult()
	{
//		I tried to get the list and the second iten on it. But I was learning that there's a problem with it and not always work.
//		But i think there is a problem with selenium and the class=search-results node-results
//		driver.findElements(By.className("search-results")).get(2).click();
		
		
//		I will use, for now, this 
		driver.findElements(By.xpath("//*[@id='search-page-results']/ol/li/*")).get(2).click();
		
		
	}
	
	public String secondResultUrl()
	{
		
		return driver.getCurrentUrl();
	}
	
	
	
}
