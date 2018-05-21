package br.com.rsi.projetoTeste;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com.br");
		
		WebElement campoTexto = driver.findElement(By.name("q"));
	
		campoTexto.sendKeys("Alura");
		campoTexto.submit();


}
	}
