package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MyAction {

	public static void main(String[] args) throws InterruptedException {

		new MyAction();

		ChromeDriver  driver= new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");

		WebElement userpassword=driver.findElement(By.name("user_password"));
		userpassword.sendKeys("admin");

		WebElement userbutton=driver.findElement(By.id("submitButton"));
		userbutton.click();
		Thread.sleep(2000);
		//  drag and drop
		//  cross hair 

		Actions act =	new Actions(driver);
		WebElement weDrag=driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td/div/div[2]/table[1]/tbody/tr/td[1]/b"));
		WebElement weDrop=driver.findElement(By.xpath("/html/body/table[4]/tbody/tr/td/div/div[14]/table[1]/tbody/tr/td[1]/b"));
		act.moveToElement(weDrag).clickAndHold(weDrag).moveToElement(weDrop).release().build().perform();
		
		act.dragAndDrop(weDrag, weDrop).perform();
		
		///  mouse over , hover 
//		Actions act=new Actions(driver);
//		WebElement weMore=driver.findElement(By.xpath("//a[text()='More']"));
//		//	act.moveToElement(weMore).build().perform();
//		//act.doubleClick().build().perform();
//		act.moveToElement(weMore).doubleClick().click().sendKeys("").build().perform();
//
//		act.contextClick(weMore).build().perform();
//
//		act.click(weMore).build().perform();
//
//		WebElement weSearch=driver.findElement(By.xpath("//input[@value='Search...']"));
//
//		act.sendKeys(weSearch, "rahul").build().perform();	
//
//		// act.dragAndDrop(weMore, weSearch).build().perform();
//
//
//		act.clickAndHold().build().perform();
//
//
//		WebElement footerLink=driver.findElement(By.linkText("vtiger.com"));
//
//		//  Scroll -  Vertical Scroll 
//		// Horizontal Scroll 
//		act.scrollByAmount(0, 1500).build().perform();
//		act.scrollToElement(footerLink).build().perform();

	}
}

