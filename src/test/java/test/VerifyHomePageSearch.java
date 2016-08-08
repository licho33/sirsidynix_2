package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.SearchResultPage;

public class VerifyHomePageSearch {


	String textToSearch = "cosugi 2016";
	
	int nroItemBusqueda;
	
	WebDriver driver;

	
	@BeforeMethod
	public void BeforeMethod()
	{
		driver = new FirefoxDriver();
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		driver.quit();
	}

	@Test
	public void verifySearchResultURL()
	{
		
		String expectedUrl = "http://www.sirsidynix.com/blog/2016/05/09/your-cosugi-compendium-everything-you-need-to-know-about";

		HomePage homepage = new HomePage(driver);
		
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		
		homepage.goToHomePage();
		
		homepage.typeTextToSearch(textToSearch);
		
		homepage.clickSearchButton();
		
		searchResultPage.clickOnSecondResult();
		
		String urlSecondResult = searchResultPage.secondResultUrl();
		
		Assert.assertEquals(urlSecondResult, expectedUrl);
		
		
				
	}
	
}