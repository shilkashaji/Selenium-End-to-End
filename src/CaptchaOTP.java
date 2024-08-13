/*import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptchaOTP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		try {
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://www.irctc.co.in/nget/train-search");
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
			WebElement imageelement 
			driver.findElement(By.xpath("(//*[@id='nlpImgContainer']//following:: img)[2]"));
			File src= imageelement.getScreenshotAs (OutputType.FILE);
			String path="E:\\eclipseprojects\\mavenproject\\captchaimages\\captcha.png";
			FileHandler.copy(src, new File(path));
			Thread.sleep(2000);
			ITesseract image = new Tesseract();
			String str =image.doOCR(new File(path));
			System.out.println("image OCR done"); System.out.println(str);
			String Captcha = str.split("below")[1].replaceAll("[^a-zA-Z0-9]", "");
			System.out.println(Captcha);
			driver.findElement(By.id("nlpAnswer")).sendKeys(Captcha);
			} catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception caught :"+e.getMessage());

	}

}*/
