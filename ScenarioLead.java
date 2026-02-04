package seleinum;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioLead {
	public static void main(String[] args)  {
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

		WebElement we_addbox= driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		we_addbox.click();

		WebElement	wefastname=driver.findElement(By.xpath("//input[@name='firstname']"));
		wefastname.sendKeys("vikash");
		String weval=	wefastname.getAttribute("value");
		System.out.println(weval);

		WebElement	welastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		Dimension size =welastname.getSize();
		int height=size.height;
		int width=size.width;
		System.out.println(height);
		System.out.println(width);
		welastname.sendKeys("Paswan"); 
		

		WebElement	wecompany=driver.findElement(By.xpath("//input[@name='company']"));
		wecompany.sendKeys("Ktm");
		wecompany.clear();
		wecompany.sendKeys("Kavasaki");

		WebElement	weemail=driver.findElement(By.xpath("//input[@name='email']"));
		String	evalue=weemail.getAttribute("value");
		System.out.println(evalue);

//		WebElement	webutton=driver.findElement(By.xpath("//input[@name='button']"));
//		webutton.click();

		WebElement	wejava=driver.findElement(By.xpath("//a[@href='javascript:void(0)']"));
		wejava.getAttribute(evalue);



// (//input[@name='username'])[1]











	}

}
