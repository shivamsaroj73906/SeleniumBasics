package seleinum;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElamentS_Concept {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement we_username=driver.findElement(By.xpath("//input[@name='user_name']"));
		we_username.sendKeys("admin");
		
		WebElement userpassword=driver.findElement(By.xpath("//input[@name='user_password']"));
		userpassword.sendKeys("admin");

		WebElement userbutton=driver.findElement(By.xpath("//input[@id='submitButton']"));
		userbutton.click();
		Thread.sleep(2000);
		List<WebElement> welist = driver.findElements(By.xpath("//td[@class='tabUnSelected']"));
		for(int i=0; i<=welist.size(); i++) {
			if(i%2==0) {
				WebElement web=welist.get(i);
				Thread.sleep(2000);
				String name=web.getText();
				System.out.println(name);
			}
			
		}


	}

}
