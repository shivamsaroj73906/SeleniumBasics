package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_class2 {

	public static void main(String[] args) {
		ChromeDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8181/");
		
		
		By by_user=By.name("user_name");
		WebElement	we_user=driver.findElement( by_user);
		we_user.sendKeys("admin");
		String	sttitle=driver.getTitle();
		System.out.println("this is a title of vtiAIger"+sttitle);
		String	stsorce=driver.getPageSource();
		System.out.println(stsorce);
		

		By by_pass=By.name("user_password");
		WebElement wepass=driver.findElement(by_pass);
		wepass.sendKeys("admin");
		String passname= driver.getTitle();
		System.out.println(passname);

		By bylogin=By.id("submitButton");
		WebElement welogin=driver.findElement(bylogin);
		welogin.click();

		By bylead=By.xpath("//a[text()='Leads']");
		WebElement welead=driver.findElement(bylead);
		welead.click();

		By bypluse=By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']");
		WebElement wepluse=driver.findElement(bypluse);
		wepluse.click();

		By byfistnane=By.name("firstname");
		WebElement	wefistname=driver.findElement(byfistnane);
		wefistname.sendKeys("shivam");
		wefistname.clear();
		wefistname.sendKeys("Rakesh");
		String stvalue=wefistname.getAttribute("value");
		System.out.println("Entered Lead Fist Name....."+ stvalue);


	}

}
