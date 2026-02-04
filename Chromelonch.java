package seleinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Chromelonch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver	driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		driver.navigate().back();
		WebElement	serch=driver.findElement(By.xpath("//textarea[@title=\"Search\"]"));
		serch.sendKeys("selenium");
		Thread.sleep(5000);
		WebElement we_click=driver.findElement(By.xpath("//div[@class='erkvQe']//span/ancestor::div[@id='c7mM1c']"));
		Actions act=new Actions(driver);
		act.moveToElement(we_click).click().build().perform();
		driver.switchTo().alert();
		//=driver.findElement(By.xpath("//li[@data-view-type='1']"));
	}

}
 