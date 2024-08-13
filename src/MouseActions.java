//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
 import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://www.amazon.com");	
		Thread.sleep(3000);
		/*Actions a = new Actions(driver);
		WebElement move= driver.findElement(By.cssSelector("#nav-link-accountList > span"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Hello").doubleClick().build().perform();
		a.moveToElement(move).build().perform();*/
		
		
		
		

		
		
		
	}
	

}
