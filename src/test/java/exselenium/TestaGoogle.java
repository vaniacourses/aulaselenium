package exselenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestaGoogle {
	
	protected WebDriver driver;
	
	@BeforeClass
	public static void configuraDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Libs\\chromedriver\\84\\chromedriver.exe");
	}
	
    @Before
    public void createDriver() {  
    
		driver = new ChromeDriver();
        driver.get("https://www.google.com.br");
    }	

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
    @After
    public void quitDriver() {
       driver.quit();
    }
}
