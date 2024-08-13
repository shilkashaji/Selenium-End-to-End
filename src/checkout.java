import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkout {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String[] names = {"Cucumber","Brocolli","Beetroot"};
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatedName= name[0].trim();
			
			List  a = Arrays.asList(names);

			int j=0;
			if (a.contains(formatedName)) {

				j++;
				driver.findElements(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button")).get(i).click();
				if(j==3)
				{
					break;
				}

			}
		}

	}

}