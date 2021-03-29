package ChoucairTestingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavegarenCurso extends Base {
	
	By CursoLocator = By.linkText("Modelo de calidad de software");

			

	public NavegarenCurso(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void IngresarCurso() throws InterruptedException {
		click(CursoLocator);
		Thread.sleep(3000);
	}

	
}
