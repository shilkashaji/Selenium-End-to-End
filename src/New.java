import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();	
	driver.get("https://rahulshettyacademy.com");	
	System.out.println(driver.getTitle());
	System.out.print(driver.getCurrentUrl());
	driver.close();
	driver.quit();
	
		
	}
	
	

}