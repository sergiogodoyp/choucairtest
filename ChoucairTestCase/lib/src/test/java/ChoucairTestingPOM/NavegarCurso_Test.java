package ChoucairTestingPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class NavegarCurso_Test {

	private WebDriver driver;
	NavegarEmpleo navegarEmpleo;
	NavegarPrepararseparaAplicar navegarPreparse;
	NavegarenCurso navegarCurso;
	
	@Before
	public void setUp() throws Exception {
		navegarEmpleo = new NavegarEmpleo(driver);
		driver = navegarEmpleo.chromeDriverConnection();
		navegarPreparse = new NavegarPrepararseparaAplicar(driver);
		navegarCurso = new NavegarenCurso(driver);
	    navegarEmpleo.visit("https://www.choucairtesting.com/");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	

	@Test
	public void test() throws InterruptedException {
		navegarEmpleo.Navegar();
		assertTrue(navegarEmpleo.isSerChoucairDisplayed());
		assertTrue(navegarEmpleo.isConvocatoriasDisplayed());
		assertTrue(navegarEmpleo.isPreparseDisplayed());
		navegarPreparse.navegarEnlace();
		assertEquals("PREPARARSE PARA APLICAR",navegarPreparse.ObtenerTextPreparse());
		navegarCurso.IngresarCurso();
		
	}

}
