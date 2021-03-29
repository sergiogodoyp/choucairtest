package ChoucairTestingPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BuscarEmpleoNoDisponibleporKeywords_Test {

	private WebDriver driver;
	NavegarEmpleo navegarEmpleo;
	NavegarConvocatorias navegarConvocatorias;
	BuscarEmpleosPorKeywords buscarEmpleosNoDisponible;
	
	
	@Before
	public void setUp() throws Exception {
		navegarEmpleo = new NavegarEmpleo(driver);
		driver = navegarEmpleo.chromeDriverConnection();
		navegarConvocatorias = new NavegarConvocatorias(driver);
		buscarEmpleosNoDisponible = new BuscarEmpleosPorKeywords(driver);
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
		buscarEmpleosNoDisponible.BuscarEmpleoNoDisponible();
		assertEquals("There are no listings matching your search.",buscarEmpleosNoDisponible.NoJobsMessage());
	}

}
