package Microtesting.OrangeHRM;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;




	public class Connexion {
	private WebDriver driver;



	  public void setUp() throws Exception {		  
		  System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");	
	    driver = new ChromeDriver();	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
	    
	   
	  
	 public void testConnexion() throws Exception {
		    driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/auth/login");
		    driver.findElement(By.id("divLogo")).click();
		    driver.findElement(By.id("txtUsername")).click();
		    driver.findElement(By.name("txtUsername")).sendKeys("admin");
		    driver.findElement(By.name("txtPassword")).click();
			driver.findElement(By.name("txtPassword")).sendKeys("Aminafaiz99@");
		    driver.findElement(By.id("btnLogin")).click();
		  }
	  
	}
	
	

