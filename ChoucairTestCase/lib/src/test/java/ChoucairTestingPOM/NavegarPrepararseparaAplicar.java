package ChoucairTestingPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavegarPrepararseparaAplicar extends Base{
	
	By PreparseLinkLocator = By.linkText("Prepararse para aplicar");
	By ObtenerTextPreparse = By.tagName("h2");

	public NavegarPrepararseparaAplicar(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void navegarEnlace() throws InterruptedException {
		click(PreparseLinkLocator);
		Thread.sleep(2000);
	}
	
	public String ObtenerTextPreparse() {
		List<WebElement> text = findElements(ObtenerTextPreparse);
		return getText(text.get(3));
	}

}