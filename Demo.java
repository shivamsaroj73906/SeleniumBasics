package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver= new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");
		
		WebElement userpassword=driver.findElement(By.name("user_password"));
		userpassword.sendKeys("admin");

		WebElement userbutton=driver.findElement(By.id("submitButton"));
		userbutton.click();

		By bylead=By.xpath("(//td[@class='tabUnSelected'])[2]");
		WebElement weleads = driver.findElement(bylead);
		weleads.click();


		WebElement weplusButton= driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));

		weplusButton.click();

		WebElement wenon =driver.findElement(By.xpath("//select[@name='salutationtype']"));
		wenon.click(); 
		wenon.sendKeys("Mr.");

		WebElement webbox=driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
		webbox.sendKeys("shivam");

		WebElement weLastName=driver.findElement(By.name("lastname"));
		weLastName.sendKeys("Saroj");

		WebElement weCompany=driver.findElement(By.name("company"));
		weCompany.sendKeys("google");

		WebElement weTitle=driver.findElement(By.xpath("//input[@id='designation']"));
		weTitle.sendKeys("New From");

		WebElement weleadDropdown=driver.findElement(By.xpath("//select[@name='leadsource']"));
		weleadDropdown.click();
		weleadDropdown.sendKeys("Cold Call");
		

		WebElement weindustryDrop=driver.findElement(By.xpath("//select[@name='industry']"));
		weindustryDrop.click();
		weindustryDrop.sendKeys("Energy");
	
		

   




		//	 
		//  driver.get("https://www.amazon.in/?");
		//  By objserch=By.id("twotabsearchtextbox");
		//  
		//  WebElement serchbox=driver.findElement(objserch);
		//  serchbox.sendKeys("iPhone 15");
		//  
		// By secbutt=By.xpath("//input[@id='nav-search-submit-button']");
		//   WebElement objopen=driver.findElement(secbutt);
		//   objopen.click();
	}
}