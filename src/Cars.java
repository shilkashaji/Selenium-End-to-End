import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;


public class Cars {

	
	 public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver-win64\\chromedriver.exe");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the webpage
	        driver.get("google.com"); // Replace with the actual URL

	        // Find elements by class name "cars"
	        List<WebElement> carElements = driver.findElements(By.className("cars"));

	        // Create lists to store cars with names less than 3 chars and more than 3 chars
	        List<String> shortNames = new ArrayList<>();
	        List<String> longNames = new ArrayList<>();

	        // Loop over the list of car element
	        for (WebElement carElement : carElements) {
	            String carName = carElement.getText().trim();

	            // Split cars into two lists based on name length
	            if (carName.length() < 3) {
	                shortNames.add(carName);
	            } else {
	                longNames.add(carName);
	            }
	        }

	        // Print the results
	        System.out.println("Cars with names less than 3 chars: " + shortNames);
	        System.out.println("Cars with names re than 3 chars: " + longNames);

	        // Close the browser
	        driver.quit();
	    }
	}

