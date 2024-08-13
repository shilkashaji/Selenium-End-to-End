import java.io.FileInputStream;

import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.testing.framework.EmailUtils;

import javax.mail.*;

import javax.mail.util.*;
import javax.mail.internet.MimeMessage;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.apache.commons.mail.util.MimeMessageUtils;

//import com.testing.framework.EmailUtils;



public class gmailOTP {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String OTP;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://onedrive.live.com/about/en-us/signin/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//Enter Email
		driver.findElement(By.xpath("//input[@type='email']"));
		
		Actions a =new Actions (driver);
		a.sendKeys("zinfogtester@gmail.com").build().perform();
		//click on Next
		a.sendKeys(Keys.TAB).sendKeys(Keys. TAB).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.id("idA_PWD_ForgotPassword")).click();
		//driver.findElement(By.name("proofOption")).click();
		driver.findElement(By.xpath("//*[@id=\"proofOption0\"]")).click();
		driver.findElement(By.id("iSelectProofAction")).click();
		
	    EmailUtils emailUtils= new EmailUtils();
		Properties prop= new Properties();
		prop.setProperty("to", "sreeshilkacp@gmail.com");
		prop.setProperty("gmail_from", "zinfogtester@gmail.com");
		prop.setProperty("gmail_username", "zinfogtester@gmail.com");
		prop.setProperty("gmail_password", "ttzszllhspxdghyh");

		prop.setProperty("gmail_port", "587");
		//prop.load(new FileInputStream("C:\\Users\\user\\Documents\\zinfogMail")); 
		List<String> emailText= emailUtils.getMessageByFromEmail(emailUtils.connectToGmail(prop),"Inbox","account-security-noreply@accountprotection.microsoft.com","Microsoft account password reset");

		if (emailText.size()<1)
			throw new Exception("NO OTP RECIEVED");
		else
		{
			String regex="[^\\d]+";
			String[] arrOTP = emailText.get(0).split(regex);
		    OTP = arrOTP[1];
			System.out.println("OTP IS "+ OTP);
		}
		
		driver.findElement(By.id("iVerifyText")).sendKeys(OTP);
		driver.findElement(By.id("iVerifyIdentityAction")).click();

	}

}
