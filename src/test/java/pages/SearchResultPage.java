package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {

	WebDriver driver;
	
	@FindBy (id = "edit-keys")
	private WebElement searchForm;
	
	@FindBy (id = "edit-submit--2")
	private WebElement searchSubmit;
	
	
	public SearchResultPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	
	
	
	
	public String searchResults()
	{
		return null;
	}
	
	
}
