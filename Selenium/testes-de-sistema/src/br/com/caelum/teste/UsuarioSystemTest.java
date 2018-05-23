package br.com.caelum.teste;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsuarioSystemTest {

	private WebDriver driver;
    private UsuariosPage usuarios;

    @Before
    public void inicializa() {
    	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        usuarios = new UsuariosPage(driver);
    }

    @Test
    public void deveAdicionarUmUsuario() {

        usuarios.visita();
        usuarios.novo().cadastra("Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br");
        assertTrue(usuarios.existeNaListagem(
                "Ronaldo Luiz de Albuquerque", "ronaldo2009@terra.com.br"));

    }

    @After
    public void encerra() {
    driver.close();
    }
}
