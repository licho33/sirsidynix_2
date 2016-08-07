package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

//	private final String HOME_PAGE = "http://www.sirsidynix.com/";
//	String textToSearch = "cosugi 2016";
	WebDriver driver;

	
	@FindBy (name = "search_block_form")
	private WebElement searchForm;
	
	@FindBy (name = "submit")
	private WebElement searchSubmit;


	public String textToSearch;

	public String homePage;
	
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void goToHomePage(String homePage) 
	{
		String hp = homePage;
		driver.get(hp);
	}
	
	public void typeTextToSearch(String textToSearch)
	{
		String text = textToSearch;
		driver.findElement((By) searchForm).clear();
		driver.findElement((By) searchForm).sendKeys(text);
		
	}
	
	public void clickSearchButton()
	{
		driver.findElement((By) searchSubmit).click();
	}

}
