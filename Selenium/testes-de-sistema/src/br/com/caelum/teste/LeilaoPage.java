package br.com.caelum.teste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeilaoPage {
	
	private WebDriver driver;
	
	public LeilaoPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LeilaoPage() {
		driver.get("http://localhost:8080/leiloes");
	}
	
	public NovoLeilaoPage novo() {
		driver.findElement(By.linkText("Novo Leilão")).click();
		return new NovoLeilaoPage(driver);
		
	}
	
	public boolean existe(String produto, double valor, String usuariom boolen usado) {
	
			return driver.getPageSource().contains(produto)&&
					driver.getPageSource().contains(String.valueOf(valor))&&
					driver.getPageSource().contains(usado ? "Sim" : "Não");
	 }

