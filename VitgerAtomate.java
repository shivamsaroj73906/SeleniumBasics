package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VitgerAtomate {

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

		String ActualWebPageTitle = driver.getTitle();
		String ExpectedWebPageTitle="Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if(ActualWebPageTitle.contains(ExpectedWebPageTitle)) {
			System.out.println("Page title is same Passed");
		}else {
			System.out.println("Page title is not same Failed");
		}





	}

}
