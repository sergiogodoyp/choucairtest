package ChoucairTestingPOM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavegarSerChoucair extends Base {

	By SerChoucairLinkLocator1 = By.linkText("¿Qué es ser Choucair?");
	By ObtenertextShoucair = By.tagName("h2");
	
	public NavegarSerChoucair(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void navegarEnlace() throws InterruptedException {
		click(SerChoucairLinkLocator1);
		Thread.sleep(2000);
	}
	
	public String ObtenertextShoucair() {
		List<WebElement> text = findElements(ObtenertextShoucair);
		return getText(text.get(0));
	}

}
