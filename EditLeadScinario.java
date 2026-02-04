package seleinum;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EditLeadScinario {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8181/");
		
		WebElement	weuser=driver.findElement(By.xpath("//input[@name='user_name']"));
		weuser.sendKeys("admin");
		WebElement	wepassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		wepassword.sendKeys("admin");
		WebElement weloginbutton = driver.findElement(By.xpath("//input[@id='submitButton']"));
		Actions actobj = new Actions(driver);
		actobj.click(weloginbutton).build().perform();
		WebElement	welead=driver.findElement(By.xpath("//a[text()='Leads']"));
		actobj.click(welead).build().perform();
		WebElement weEdit = driver.findElement(By.xpath("(//a[text()='edit'])[1]"));
		actobj.click(weEdit).build().perform();
		
		WebElement phone=driver.findElement(By.xpath("//input[@id='mobile']"));
		phone.clear();
		phone.sendKeys("8989222211");
		
		
		String ActPHONE = phone.getAttribute("value");
	    String ExpPHONE="8989222211";
	    
	    if(ActPHONE.contains(ExpPHONE)) {
	    	System.out.println("Actual and Expected Mobile no is same Passed");
	    }
	    else{
	    	System.out.println("Actual and Expected Mobile no is not same Failed");
	    }
	
		
		
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

	}

}
