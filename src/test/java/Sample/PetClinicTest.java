package Sample;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class PetClinicTest {
	public WebDriver driver;
	

    //public ThreadLocal<RemoteWebDriver> threadDriver = null;
 
//	@BeforeTest
//   public void beforeTest() {
//	System.setProperty("webdriver.gecko.driver", "/var/lib/jenkins/workspace/Petclininc/geckodriver");  
//	//driver = new ChromeDriver(); 
// //File pathToBinary = new File("//opt//firefox47/bin//firefox ");
// //FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
// //FirefoxProfile firefoxProfile = new FirefoxProfile();
// //driver = new FirefoxDriver(ffBinary,firefoxProfile);
// driver = new FirefoxDriver();  
//  }
  
	@Test
  public void testEasy() throws InterruptedException, MalformedURLException
  
  {   
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		driver = new RemoteWebDriver(new URL("http://192.168.1.101:4445//wd/hub"), capability);
		driver.navigate().to("https://github.com/");
		
		//threadDriver = new ThreadLocal<RemoteWebDriver>();
//        DesiredCapabilities dc = new DesiredCapabilities();
//        FirefoxProfile fp = new FirefoxProfile();
//        dc.setCapability(FirefoxDriver.PROFILE, fp);
//        dc.setBrowserName(DesiredCapabilities.firefox().getBrowserName());
//        threadDriver.set(new RemoteWebDriver(new URL("http://192.168.1.101:4445//wd/hub"), dc));
		
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//System.setProperty("webdriver.gecko.driver", "/var/lib/jenkins/workspace/Petclininc/geckodriver"); 
		//WebDriver driver =new FirefoxDriver();
		//driver.navigate().to("http://192.168.99.1:8084/petclinic/");
	  	//driver.get("http://localhost:8084/petclinic/");  
	  	//WebDriverWait wait = new WebDriverWait(driver, 20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/div[1]/div[@class='container xd-container']/h2")));
		 //driver.manage().window().maximize();	
	  	//Thread.sleep(2000);
	  	/*String title = driver.getTitle();   
        System.out.println("Home Page Header : "+title);
        
//       //Function to Add Owner
//        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
//        driver.findElement(By.linkText("Add Owner")).click();
//        driver.findElement(By.id("firstName")).clear();
//        driver.findElement(By.id("firstName")).sendKeys("DevOps");
//        driver.findElement(By.id("lastName")).clear();
//        driver.findElement(By.id("lastName")).sendKeys("Team");
//        driver.findElement(By.id("address")).clear();
//        driver.findElement(By.id("address")).sendKeys("ThinkPalm");
//        driver.findElement(By.id("city")).clear();
//        driver.findElement(By.id("city")).sendKeys("COK");
//        driver.findElement(By.id("telephone")).clear();
//        driver.findElement(By.id("telephone")).sendKeys("758912");
//        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
//        //Function to add Pet
//        driver.findElement(By.linkText("Add New Pet")).click();
//        driver.findElement(By.id("name")).clear();
//        driver.findElement(By.id("name")).sendKeys("MyPet");
//        driver.findElement(By.id("birthDate")).click();
//        driver.findElement(By.linkText("1")).click();
//         new Select(driver.findElement(By.id("type"))).selectByVisibleText("bird");
//        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
//        //Function to add visit
//        driver.findElement(By.linkText("Add Visit")).click();
//        driver.findElement(By.id("description")).clear();
//        driver.findElement(By.id("description")).sendKeys("Sick");
//        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
//        driver.findElement(By.xpath("//li[2]/a/span[2]")).click();
//        driver.findElement(By.name("lastName")).clear();
//        driver.findElement(By.name("lastName")).sendKeys("Team");
//        driver.findElement(By.cssSelector("button.btn.btn-default")).click();
//       // driver.findElement(By.linkText("PDF")).click();
//        Thread.sleep(2000);       
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
       
		*/
	  	driver.close();
    }

//  @AfterTest
//  public void afterTest() {
//  
//     driver.quit();   
//}
  
}