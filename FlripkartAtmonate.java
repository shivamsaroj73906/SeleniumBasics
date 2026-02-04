package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlripkartAtmonate {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		String	Exclue=driver.getCurrentUrl();

		WebElement flipSerch=driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"));
		flipSerch.sendKeys("Moblie");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
