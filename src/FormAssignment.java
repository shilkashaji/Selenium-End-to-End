import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Sreya");
		driver.findElement(By.name("email")).sendKeys("sreya@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("sreya123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement sdrop= driver.findElement(By.id("exampleFormControlSelect1"));
		Select s=new Select(sdrop);
		s.selectByIndex(1);
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("16-12-2021");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.xpath("/html/body/app-root/form-comp/div/div[2]/div")).getText());
		
		
		
		
		
		
		
		
	}

}
