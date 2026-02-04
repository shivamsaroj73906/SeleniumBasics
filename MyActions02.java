package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class MyActions02 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver  driver= new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");

		WebElement userpassword=driver.findElement(By.name("user_password"));
		userpassword.sendKeys("admin");

		WebElement userbutton=driver.findElement(By.id("submitButton"));
		userbutton.click();
		Thread.sleep(2000);
		WebElement	wemore=driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		Actions  act=new Actions(driver);
		act.moveToElement(wemore).build().perform();
		act.contextClick(wemore).build().perform();


		WebElement	welead=driver.findElement(By.xpath("(//a[text()='Leads'])[1]"));
		act.doubleClick(welead).build().perform();

		WebElement	wepluse=driver.findElement(By.xpath("//img[contains(@title,'Create Lead')]"));
		//driver.findElement(By.xpath("//img[starts-with(@title,'Create')]"));
		act.click(wepluse).build().perform();


		WebElement dropMr=    driver.findElement(By.xpath("//select[@name='salutationtype']"));
		Select s1=	new	Select(dropMr);
		s1.selectByContainsVisibleText("Mr");


		WebElement	wefistname=driver.findElement(By.xpath("//input[@name='firstname']")); 
		act.sendKeys(wefistname,"shivam").build().perform();

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		WebElement	wesechr=driver.findElement(By.xpath("//table[@class='searchUIBasic small']/tbody/tr/td[2]/b"));

		//Desident// 

		//driver.findElement(By.xpath("//table[@class='searchUIBasic small']//b[text()='Search for']"));






	}

}
