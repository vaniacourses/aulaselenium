package exselenium;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void testaTituloBuscaGoogle() throws InterruptedException {
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("teste de software");
		search.submit();		
		assertTrue("Título da página difere do esperado", driver.getTitle().contentEquals("teste de software - Pesquisa Google"));		
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
}
