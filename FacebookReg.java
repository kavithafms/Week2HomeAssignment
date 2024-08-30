package homeassignment.week2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			ChromeDriver registration=new ChromeDriver();
			registration.get("https://www.facebook.com/");
			registration.manage().window().maximize();
			registration.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			registration.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);			
			registration.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SeleniumTest");
			registration.findElement(By.xpath("//input[@name='lastname']")).sendKeys("SeleniumTest");
			registration.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8082782782");
			registration.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Fms635703$%");
			WebElement day = registration.findElement(By.xpath("//select[@id='day']"));
			WebElement month = registration.findElement(By.xpath("//select[@id='month']"));
			WebElement year = registration.findElement(By.xpath("//select[@id='year']"));
			Select DOBD=new Select(day);
			Select DOBM=new Select(month);
			Select DOBY=new Select(year);
			DOBD.selectByIndex(27);
			DOBM.selectByIndex(6);
			DOBY.selectByValue("1988");
				
//			registration.findElement(By.xpath("//label[text()='Male']")).click();
			registration.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
			registration.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			registration.findElement(By.xpath("//button[@name='websubmit']")).click();
			
//		    
		    	
		    
			
			
			
		}

	}
