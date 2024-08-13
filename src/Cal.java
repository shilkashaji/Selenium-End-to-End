import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		driver.findElement(By.xpath("//*[@id=\"second_date_picker\"]")).click();
        Thread.sleep(2000);

		while(!driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] [class='ui-datepicker-title']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all'] span[class='ui-icon ui-icon-circle-triangle-e']")).click();
		}
		List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
		
		int count=driver.findElements(By.className("ui-state-default")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("ui-state-default")).get(i).click();
		break;
		}

		}
		
		
		
	}

}
