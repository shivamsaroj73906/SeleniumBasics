package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Revison {

	public static void main(String[] args) {
       ChromeDriver driver=new ChromeDriver();
       driver.get("http://localhost:8181/");
       String we_loginPageTitle=driver.getTitle();
      String Expcted_title="vtiger CRM 5 - Commercial Open Source CRM";
      if(we_loginPageTitle.equals(Expcted_title)) {
    	  System.out.println("Match");
      }else {
    	  System.out.println("Not match");
      }
     WebElement weuser_name=driver.findElement(By.xpath("//input[@name='user_name']"));
     
     
     

	}

}
