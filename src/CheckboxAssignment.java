import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice//");
		driver.findElement(By.id("checkBoxOption1")).click();
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("successfully checked ");
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		//System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println("successfully unchecked ");

		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		

		
		
		
	}

}
