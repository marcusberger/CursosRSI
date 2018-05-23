package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuarioSystemTest {
	

	private ChromeDriver driver;
	private UsuariosPage usuarios;
	
	
	@Before
	public void inicializa() {
		this.driver = new ChromeDriver();
		usuarios = new  UsuariosPage(driver);
	}
	
	@Test
	public void deveAdicionarUmUsuario() {
		
		usuarios.visita();
        usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque","ronaldo2009@terra.com.br");
        assertTrue(usuarios.existeNaLista("Ronaldo Luiz de Albuquerque","ronaldo2009@terra.com.br"));
		
//		usuarios.visita();
//		usuarios.novo().cadastra("Marcus", "ded@rfrf.com");
//		assertTrue(usuarios.existeNaLista("Marcus", "ded@rfrf.com"));
	}
	
	@After
	public void finaliza(){
		driver.close();
		
	}

}
