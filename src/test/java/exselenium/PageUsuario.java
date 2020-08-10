package exselenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageUsuario {
	

	@FindBy(id="firstName")
	private WebElement txtNome;
	
	@FindBy(id="lastName")
	private WebElement txtSobrenome;	
	
	@FindBy(id="username")
	private WebElement txtUsuario;		
	
	@FindBy(name="Passwd")
	private WebElement txtSenha;
	
	@FindBy(name="ConfirmPasswd")
	private WebElement txtConfirmaSenha;
	
	@FindBy(id="accountDetailsNext")
	private WebElement botaoProximo;

	

	public void cadastra(String nome, String sobrenome, String usuario, String senha, String confirmaSenha) {
		txtNome.sendKeys(nome);
		txtSobrenome.sendKeys(sobrenome);
		txtUsuario.sendKeys(usuario);
		txtSenha.sendKeys(senha);
		txtConfirmaSenha.sendKeys(confirmaSenha);
		botaoProximo.click();
	}

}
