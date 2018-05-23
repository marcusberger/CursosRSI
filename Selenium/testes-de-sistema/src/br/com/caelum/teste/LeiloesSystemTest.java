package br.com.caelum.teste;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeiloesSystemTest {
	
	private WebDriver driver;
	private LeilaoPage leiloes;
	
	public void inicializa() {
		driver = new ChromeDriver();
		leiloes = new LeilaoPage(driver);
		
	}

}
