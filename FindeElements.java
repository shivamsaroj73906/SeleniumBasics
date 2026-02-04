package seleinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindeElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");

		WebElement username=driver.findElement(By.name("user_name"));
		username.sendKeys("admin");

		WebElement userpassword=driver.findElement(By.name("user_password"));
		userpassword.sendKeys("admin");

		WebElement userbutton=driver.findElement(By.id("submitButton"));
		userbutton.click();

		Thread.sleep(2000);

		WebElement	welead=driver.findElement(By.xpath("//a[text()='Leads']"));
		welead.click();

		List<WebElement>	ro=driver.findElements(By.xpath("//tr"));
		int	totalRo=ro.size();
		System.out.println(totalRo); 
		
	List<WebElement>	leadtable=driver.findElements(By.xpath("//table[@class='lvt small']//tr[@onmouseout]//span[@vtfieldname='firstname']/preceding-sibling::a"));
	 int number_of_name= leadtable.size();
	 for(int i=0;i<=number_of_name;i++) {
		 WebElement list=leadtable.get(i);
		String allname=list.getText();
		System.out.println(allname ); 
		
	 }


	}
}


