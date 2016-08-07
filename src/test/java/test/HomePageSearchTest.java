package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageSearchTest {

	private final String HOME_PAGE = "http://www.sirsidynix.com/";

	String textToSearch = "cosugi 2016";

	@Test
	public void verifySearch()
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		HomePage homepage = new HomePage(driver);
		
		homepage.goToHomePage(HOME_PAGE);
		
		homepage.typeTextToSearch(textToSearch);
		
		homepage.clickSearchButton();
		
		
		
			
		
	}

}