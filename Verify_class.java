package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_class {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8181/");

		By use_name = By.name("user_name");
		WebElement we_user = driver.findElement(use_name);
		we_user.sendKeys("rakesh1");
		String ab = we_user.getAttribute("value");
		System.out.println("this is wrong user name .." + ab);
		we_user.clear();
		we_user.sendKeys("admin");
		String ab1 = we_user.getAttribute("value");
		System.out.println("this is valid user name .." +ab1);

		By us_pass = By.name("user_password");
		WebElement we_pass = driver.findElement(us_pass);
		we_pass.sendKeys("admin");

		By us_butto = By.id("submitButton");
		WebElement webutto = driver.findElement(us_butto);
		webutto.click();
		Thread.sleep(2000);

		By bylead = By.xpath("//a[text()='Leads']");
		WebElement weleads = driver.findElement(bylead);
		weleads.click();

		WebElement weplusButton = driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		weplusButton.click();

		WebElement weserch = driver.findElement(By.xpath("//input[@value='Search...']"));
		weserch.sendKeys("contact1");
		String attribute = weserch.getAttribute("value");
		System.out.println("wrong value...  " + attribute);
		weserch.clear();
		weserch.sendKeys("lead1");
		String lead = weserch.getAttribute("value");
		System.out.println("valid value..." + lead);
		

	}

}
