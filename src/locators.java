import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.linkText("Forgot your password?")).click();
		//https://github.com/shilkashaji/Selenium-End-to-End.git
		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.xpath("//*[@id=\"container\"]/div[1]/form/input[1]")).sendKeys("jhon");
		driver.findElement(By.cssSelector("#container > div.form-container.sign-up-container > form > input[type=text]:nth-child(3)")).sendKeys("rahul@gmail.com");
		
		
	}

}
