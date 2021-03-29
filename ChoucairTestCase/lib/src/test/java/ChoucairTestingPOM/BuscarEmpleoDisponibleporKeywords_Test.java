package ChoucairTestingPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BuscarEmpleoDisponibleporKeywords_Test {

	private WebDriver driver;
	NavegarEmpleo navegarEmpleo;
	NavegarConvocatorias navegarConvocatorias;
	BuscarEmpleosPorKeywords buscarEmpleosDisponible;
	
	@Before
	public void setUp() throws Exception {
		navegarEmpleo = new NavegarEmpleo(driver);
		driver = navegarEmpleo.chromeDriverConnection();
		navegarConvocatorias = new NavegarConvocatorias(driver);
		buscarEmpleosDisponible = new BuscarEmpleosPorKeywords(driver);
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
		navegarConvocatorias.navegarEnlace();
		assertEquals("CONVOCATORIAS",navegarConvocatorias.ObtenertextConvocatorias());
		buscarEmpleosDisponible.BuscarEmpleoDisponible();
		assertEquals("Search completed. Found 1 matching record.",buscarEmpleosDisponible.SearchMessageJob());
	}

}
