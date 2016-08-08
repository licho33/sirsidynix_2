package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;
import pages.SearchResultPage;

public class Verify_HomePageSearch {

	
	private final String HOME_PAGE = "http://www.sirsidynix.com/";

	String textToSearch = "cosugi 2016";
	
	int nroItemBusqueda;

	
	@Test
	public void verifySearchResultURL()
	{
		
		String expectedUrl = "http://www.sirsidynix.com/blog/2016/05/09/your-cosugi-compendium-everything-you-need-to-know-about";
		
		WebDriver driver = new FirefoxDriver();

		HomePage homepage = new HomePage(driver);
		
		SearchResultPage searchResultPage = new SearchResultPage(driver);
		
		homepage.goToHomePage(HOME_PAGE);
		
		homepage.typeTextToSearch(textToSearch);
		
		homepage.clickSearchButton();
		
		searchResultPage.clickOnSecondResult();
		
		String urlSecondResult = searchResultPage.secondResultUrl();
		
		Assert.assertEquals(urlSecondResult, expectedUrl);
		
		Assert.assertTrue(true, "The URL is the expected");
		Assert.assertFalse(false, "The URL isn't the expected");
		
		
				
	}
	
}