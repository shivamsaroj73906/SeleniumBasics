package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ineartiane {

	private static final String Actions = null;

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement	we_user=driver.findElement(By.xpath("//input[@name='user_name']"));
		we_user.sendKeys("admin");
		WebElement we_pass=driver.findElement(By.xpath("//input[@name='user_password']"));
		we_pass.sendKeys("admin");
		WebElement	we_butten=driver.findElement(By.xpath("//input[@id='submitButton']"));
		we_butten.click();
		Thread.sleep(5000);
		WebElement	we_lead=driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']"));
		we_lead.click();
		WebElement we_pluse=driver.findElement(By.xpath("//img[@alt='Create Lead...']"));
		we_pluse.click();
		//Select	sel=new Select();
		WebElement	we_drop=driver.findElement(By.xpath("//Select[@name='salutationtype']"));
		Select	sel=new Select(we_drop);
		sel.selectByVisibleText("Mr.");
		WebElement	we_fisrna=driver.findElement(By.xpath("//input[@name='firstname']"));
		we_fisrna.sendKeys("Shivam");
		WebElement	welastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		welastname.sendKeys("Saroj");
		WebElement	we_Company=driver.findElement(By.xpath("//input[@name='company']"));
		we_Company.sendKeys("babatellu");
		WebElement	we_title=driver.findElement(By.xpath("//input[@id='designation']"));
		we_title.sendKeys("instgram");
		WebElement	we_drop1=driver.findElement(By.xpath("//select[@name='leadsource']"));
	Select selobj	=new Select(we_drop1);
	selobj.selectByIndex(6);


	}

}
