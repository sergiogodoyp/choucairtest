package ChoucairTestingPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavegarConvocatorias extends Base{
	
	By ConvocatoriaslinkLocator = By.linkText("Convocatorias");
	By ObtenertextConvocatorias = By.tagName("h2");

	public NavegarConvocatorias(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void navegarEnlace() throws InterruptedException {
		click(ConvocatoriaslinkLocator);
		Thread.sleep(2000);
	}
	
	public String ObtenertextConvocatorias() {
		List<WebElement> text = findElements(ObtenertextConvocatorias);
		return getText(text.get(1));
	}
	

}