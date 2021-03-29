package ChoucairTestingPOM;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class NavegarEmpleo_Test {
	
	private WebDriver driver;
	NavegarEmpleo navegarEmpleo;

	@Before
	public void setUp() throws Exception {
		navegarEmpleo = new NavegarEmpleo(driver);
		driver = navegarEmpleo.chromeDriverConnection();
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
		
	}

}