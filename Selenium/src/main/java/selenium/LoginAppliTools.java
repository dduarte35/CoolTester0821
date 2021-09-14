package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAppliTools {

	public static void main(String[] args) {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.applitools.com/"); //Inicializa el chrome en la URL especificada
		driver.manage().window().maximize(); //Maximizar ventanara para verla completa
		
		//Login
		//Obteniendo objetos/webelement de la pagina web
//		WebElement userName = driver.findElement(By.id("txtUsername"));
//		WebElement password = driver.findElement(By.id("txtPassword"));
//		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
//				
//		//Login
//		userName.sendKeys("Admin");
//		Thread.sleep(2000);
//		password.sendKeys("admin123");
//		Thread.sleep(2000);
//		loginBtn.click();
//		Thread.sleep(2000);
//				
//		driver.close();

	}

}
