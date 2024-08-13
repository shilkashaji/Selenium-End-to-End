//import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitdemo {

	public static void main(String[] args) throws InterruptedException, Exception {
		test();
	}
	public static void test() throws Exception {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://goldzintest.zinfog.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("9999999999");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/section/div/div/div[2]/div/div/form/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"collections\"]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[3]/section/div[1]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/form/div[1]/div")).click();
		Runtime.getRuntime().exec("C:\\Users\\user\\Documents\\fileupload.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Ring");
		driver.findElement(By.id("link")).sendKeys("https://www.tanishq.co.in/shop/finger-rings");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[2]/form/button")).click();
		Thread.sleep(3000);
		
		
		
		
	}

}
