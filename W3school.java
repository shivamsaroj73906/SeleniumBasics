package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {
	//iframe[@id='howto_iframe']
	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		WebElement frame=	driver.findElement(By.xpath("   //iframe[@id='howto_iframe']"));
		driver.switchTo().frame(frame);

		WebElement text=driver.findElement(By.xpath("//div[text()='Caption Text']"));
		String innerText=text.getText();
		System.out.println(innerText);
		driver.findElement(By.xpath("//a[@onclick='plusSlides(1)']")).click();
		driver.switchTo().defaultContent();
		WebElement innerTextHow= driver.findElement(By.xpath("//h2[text()='How To Section']"));
		String actText=	innerTextHow.getText(); 
		System.out.println(actText);
		

	}

}
