import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class goldzin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://goldzintest.zinfog.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("1234567890");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/section/div/div/div[2]/div/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"stores\"]/a/span")).click();
	}

}
