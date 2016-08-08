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

		driver.findElements(By.xpath("//*[@id='search-page-results']/ol/li/*")).get(2).click();
		
	}
	
	public String secondResultUrl()
	{
		
		return driver.getCurrentUrl();
	}
	
	
	
}
