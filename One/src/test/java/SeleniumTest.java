import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterMethod;

public class SeleniumTest {
	
	
	public static WebDriver driver;
	
  @Test
  public void f() {
	  
	  
  }
  @BeforeMethod
  @Parameters({"email", "pass","zip","phone"})
  public void beforeMethod( String email, String pass, String zip, String phone) throws InterruptedException {
	  
      	System.setProperty("webdriver.chrome.driver","C:\\Users\\asimf\\eclipse-workspace\\One\\driver\\chromedriver.exe");
      	driver = new ChromeDriver();
  		driver.get("https://www.homedepot.com");
  		//driver.manage().window().maximize();
  		Thread.sleep(5000);
  		
  		WebElement login = driver.findElement(By.id("headerMyAccount"));
  		login.click();
  		
  		Thread.sleep(5000);
  		
  		WebElement register = driver.findElement(By.cssSelector("p#SPSORegister a[isregisterlink='true']"));
  		register.click();
  		
  		Thread.sleep(5000);
  		
  		WebElement signUpButton = driver.findElement(By.className("bttn--primary"));
  		signUpButton.click();
  		
  		Thread.sleep(5000);
  		
  		WebElement emailField = driver.findElement(By.xpath("//*[@name='email']"));
  		emailField.sendKeys(email);
  		
  		
  		Thread.sleep(5000);
  		
  		
  		WebElement passField = driver.findElement(By.xpath("//*[@name='password']"));
  		passField.sendKeys(pass);
  		
  		
  		Thread.sleep(5000);
  		
  		
  		WebElement zipField = driver.findElement(By.xpath("//*[@name='zipcode']"));
  		zipField.sendKeys(zip);
  		
  		
  		Thread.sleep(5000);
  		
  		
  		WebElement phoneField = driver.findElement(By.xpath("//*[@name='phone']"));
  		phoneField.sendKeys(phone);
  		
  		
  		Thread.sleep(5000);
  		
  		WebElement submitButton = driver.findElement(By.xpath("//*[@class='bttn--primary']"));
  		submitButton.click();
  		
  		Thread.sleep(10000);
  		
  		
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  driver.close();
  }

}
