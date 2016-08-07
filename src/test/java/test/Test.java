package test;

import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Test {

	
	private WebDriver driver = new FirefoxDriver();

//	@Test
	public void homePageTest(){
		HomePage homepage = new HomePage(driver);
		homepage.goToHomePage();
		
	}
	
	
		
	
}
