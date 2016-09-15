package Sample;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PetClinicTest {

 private WebDriver  driver;
	

   @BeforeTest
   public void beforeTest() {
	
   //setup with gecko driver	   
   System.setProperty("webdriver.gecko.driver", "/var/lib/jenkins/workspace/Petclininc/geckodriver"); 
   driver = new FirefoxDriver(); 


   /*   
  //setup with seleniium Grid
  DesiredCapabilities capability = DesiredCapabilities.firefox();  
  driver = new RemoteWebDriver(new URL("http://192.168.1.101:4445//wd/hub"), capability);
    */
	
   
   }
  
	@Test
  public void testEasy() throws InterruptedException, MalformedURLException
  
  {   
		
		
		driver.navigate().to("http://192.168.99.1:8084/petclinic/");
		driver.manage().window().maximize();	
		Thread.sleep(2000);
		
	  	String title = driver.getTitle();   
        System.out.println("Home Page Header : "+title);
    
           
        
        System.out.println("adding owner and pet");
		driver.findElement(By.xpath("//nav//ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div//a[contains(text(),'Add Owner')]")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("def");
		driver.findElement(By.id("address")).sendKeys("99th Street");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		driver.findElement(By.id("telephone")).sendKeys("4567891230");
		driver.findElement(By.xpath("//div[@class='col-sm-offset-2 col-sm-10']/button")).click();
		driver.findElement(By.xpath("//div[@class='container xd-container']/a[2]")).click();
		driver.findElement(By.id("name")).sendKeys("Ghost");
		driver.findElement(By.id("birthDate")).sendKeys("2015/05/05");
		driver.findElement(By.xpath("//div[@class='container-fluid']")).click();
		Select select=new Select(driver.findElement(By.id("type")));
		select.selectByVisibleText("dog");
		
		driver.findElement(By.xpath("//form//div/button[@class='btn btn-default']")).click();
       
		
	  	
    }

  @AfterTest
  public void afterTest() {
  driver.close();   
  }
}
  
