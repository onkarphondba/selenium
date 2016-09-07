package Sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PetClinicTest {
	private WebDriver driver;
  @BeforeTest
   public void beforeTest() {
	System.setProperty("webdriver.chrome.driver", "//home//ec2-user//chromedriver");  
	driver = new ChromeDriver(); 
  }
  @Test
  public void testEasy() throws InterruptedException
  {   
	  	//driver.get("http://192.168.3.102:8083/petclinic/");  
	  	driver.get("http://192.168.1.118:8084/petclinic/");  
	  	WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[@class='container xd-container']/h2")));
		 driver.manage().window().maximize();	
	  	//Thread.sleep(2000);
	  	String title = driver.getTitle();   
        System.out.println("Home Page Header : "+title);
        
       //Function to Add Owner
        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
        driver.findElement(By.linkText("Add Owner")).click();
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("DevOps");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Team");
        driver.findElement(By.id("address")).clear();
        driver.findElement(By.id("address")).sendKeys("ThinkPalm");
        driver.findElement(By.id("city")).clear();
        driver.findElement(By.id("city")).sendKeys("COK");
        driver.findElement(By.id("telephone")).clear();
        driver.findElement(By.id("telephone")).sendKeys("758912");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        //Function to add Pet
        driver.findElement(By.linkText("Add New Pet")).click();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("MyPet");
        driver.findElement(By.id("birthDate")).click();
        driver.findElement(By.linkText("1")).click();
        new Select(driver.findElement(By.id("type"))).selectByVisibleText("bird");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        //Function to add visit
        driver.findElement(By.linkText("Add Visit")).click();
        driver.findElement(By.id("description")).clear();
        driver.findElement(By.id("description")).sendKeys("Sick");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
        driver.findElement(By.name("lastName")).clear();
        driver.findElement(By.name("lastName")).sendKeys("Team");
        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
       // driver.findElement(By.linkText("PDF")).click();
        Thread.sleep(2000);       
        
    }

  @AfterTest
  public void afterTest() {
  
     driver.quit();   
}
}
