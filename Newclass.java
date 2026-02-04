package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclass {

	
	public static void main(String []arsg) {
	ChromeDriver driver=new	ChromeDriver();
	driver.get("http://localhost:8181/");
	 WebElement weusername=driver.findElement(By.xpath("//input[@name='user_name']"));
	String avalue=weusername.getAttribute("value");
	System.out.println(avalue);
	  String wename=weusername.getAttribute("name");
	  System.out.println(wename +"  :-admin");
	 weusername.sendKeys(  wename+  "admin");
	  
	 WebElement userpass=driver.findElement(By.name("user_password"));
	 String pass=userpass.getAttribute("type");
	 System.out.println(pass);
	 String namepass=weusername.getAttribute("name");
	 System.out.println(userpass);
	 userpass.sendKeys("admin");
	  
	}
}
