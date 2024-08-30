package homeassignment.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver createlead=new ChromeDriver();
		createlead.get("http://leaftaps.com/opentaps");
		createlead.manage().window().maximize();
		createlead.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		createlead.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");	
		createlead.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		createlead.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		createlead.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
		createlead.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		createlead.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Cognizant");
		//createlead.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		createlead.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Shiva");
		createlead.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("TestLeaf");
		createlead.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Mr");
		createlead.findElement(By.xpath("//input[@name='submitButton']")).click();
		String pageTitle=createlead.getTitle();
		System.out.println(pageTitle);
		createlead.close();
		
				
		
		
		
		
	}

}
