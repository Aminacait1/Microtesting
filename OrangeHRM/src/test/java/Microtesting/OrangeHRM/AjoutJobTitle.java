package Microtesting.OrangeHRM;
import static org.testng.Assert.fail;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AjoutJobTitle {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeTest
	public void login() throws Exception {
		
		Connexion cnx = new Connexion ();
		cnx.setUp();
		cnx.testConnexion();
		
	}
	
	 @Test
	  public void testJobTitle() throws Exception {
	    driver.get("http://127.0.0.1/orangehrm-4.3.5/symfony/web/index.php/dashboard");
	   
	   
	    // ERROR: Caught exception [ERROR: Unsupported command [loadVars | donneesJT.csv | ]]
	    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	    driver.findElement(By.id("menu_admin_Job")).click();
	    driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	    driver.findElement(By.id("btnAdd")).click();
	    driver.findElement(By.id("jobTitle_jobTitle")).click();
	    driver.findElement(By.id("jobTitle_jobTitle")).clear();
	    driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("consultanttest66");
	    driver.findElement(By.id("jobTitle_jobDescription")).click();
	    driver.findElement(By.id("jobTitle_jobDescription")).clear();
	    driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("consultanttest1");
	    driver.findElement(By.id("jobTitle_note")).click();
	    driver.findElement(By.id("jobTitle_note")).clear();
	    driver.findElement(By.id("jobTitle_note")).sendKeys("consultant1");
	    // ERROR: Caught exception [ERROR: Unsupported command [endLoadVars |  | ]]
	    driver.findElement(By.id("btnSave")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	
	
	

}
