package exselenium;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestaUsuariosGoogle {

	protected WebDriver driver;

	@BeforeClass
	public static void configuraDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Libs\\chromedriver\\84\\chromedriver.exe");
	}

	@Before
	public void createDriver() {

		driver = new ChromeDriver();
 		driver.get("https://accounts.google.com/signup");
	}

	@Test
	public void testaUsuarioExistente() throws InterruptedException {
		WebElement nome = driver.findElement(By.id("firstName"));
		nome.sendKeys("José");
		WebElement sobrenome = driver.findElement(By.id("lastName"));
		sobrenome.sendKeys("da Silva");		
		WebElement usuario = driver.findElement(By.id("username"));
		usuario.sendKeys("josedasilva");	
		WebElement senha = driver.findElement(By.name("Passwd"));
		senha.sendKeys("12345678");			
		WebElement confirmaSenha = driver.findElement(By.name("ConfirmPasswd"));
		confirmaSenha.sendKeys("12345678");			
		WebElement botaoProximo = driver.findElement(By.id("accountDetailsNext"));
		botaoProximo.click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement validaUsuario = driver.findElement(By.xpath("//*[@id=\"view_container\"]/form/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/div[2]/div"));
		assertTrue("Não validou usuário existente", validaUsuario.getText().contains("Este nome de usuário já está em uso. Tente outro."));	
	
	}

	@After
	public void quitDriver() {
		driver.quit();
	}
}
