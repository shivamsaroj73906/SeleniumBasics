package seleinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DeleteLeadScinario {

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
		WebElement wedelet = driver.findElement(By.xpath("(//a[text()='del'])[3]"));
		actobj.click(wedelet).build().perform();
		driver.switchTo().alert().accept();
		

	}

}
