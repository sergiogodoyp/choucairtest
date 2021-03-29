package ChoucairTestingPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostularaEmpleo extends Base {

	By CursoLocator = By.cssSelector(".post-10704 > a > .position > h3");
	By applicationbuttonLocator = By.cssSelector("input[value=\"Apply for job\"]");
	By NombreCompletoLocator = By.id("nombre-completo");
	By CorreoElectronicoLocator = By.id("correo-electronico");
	By CelularLocator = By.id("celular-o-telefono-de-contacto");
	By EstudiosLocator = By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente");
	By TiempoExperienciaLocator = By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica");
	By AutomatizacionLocator = By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica");
	By ExpectativaSalarialLocator= By.id("cual-es-tu-aspiracion-salarial");
	By DisponibilidadLocator = By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias");
	By MensajeAdicionalLocator = By.id("mensaje-adicional");
	By ElegiCVLocator = By.id("cv");
	By EnviarDatos = By.cssSelector("p>input[type=\"submit\"]");
	By MensajeConfirmacion = By.cssSelector("p[class=\"job-manager-message\"]");
	
	public PostularaEmpleo(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void VerEmpleo() {
		click(CursoLocator);
		
	}
	
	public void Postular() throws InterruptedException {
		Scroll();
		click(applicationbuttonLocator);
		Thread.sleep(2000);
		type("Juan Perez",NombreCompletoLocator);
		type("prueba@gmail.com",CorreoElectronicoLocator);
		type("99999999",CelularLocator);
		type("Prueba",EstudiosLocator);
		type("1 año",TiempoExperienciaLocator);
		type("Prueba",TiempoExperienciaLocator);
		type("4000",ExpectativaSalarialLocator);
		type("SI",DisponibilidadLocator);
		type("Pruebas",MensajeAdicionalLocator);
		UploadFile(ElegiCVLocator);
		Thread.sleep(2000);
		Scroll();
		click(EnviarDatos);
		Thread.sleep(2000);
		
	}
	
	public String MensajeConfirmacion() {
		return getText(MensajeConfirmacion);
	}
	
}
