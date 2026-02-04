package seleinum;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_senario {

	public static void main(String[] args) {
		ChromeDriver	driver=new	ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		WebElement	we_Alert=driver.findElement(By.xpath("//input[@type='text']"));
		we_Alert.sendKeys("12345");
		WebElement	we_butan=driver.findElement(By.xpath("//input[@type='submit']"));
		we_butan.click();
		Alert 	alrt_we=driver.switchTo().alert();
		String	text_mess=alrt_we.getText();
		System.out.println(text_mess);
		alrt_we.accept();
		String	text_print=alrt_we.getText();
		System.out.println(text_print);
		alrt_we.accept();
		

		


	}

}
