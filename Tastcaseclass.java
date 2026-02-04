package seleinum;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tastcaseclass {

	public static void main(String[] args) {
		verifiCreatlead();
		equalmethode();	}
	public static void verifiCreatlead() {
		ChromeDriver driver=new	ChromeDriver();
		driver.get("http://localhost:8181/");
		String expectedtitel="vtiger CRM 5 - Commercial Open Source CRM ";
		String titel=driver.getTitle();
		System.out.println("broser titel " + titel);
		if(expectedtitel.equalsIgnoreCase(titel)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");

		}
		WebElement welead=driver.findElement(By.name("user_name"));
		String attribut=welead.getAttribute("name");
		boolean t=welead.isDisplayed();
		System.out.println(t);
		boolean st =welead.isEnabled();
		System.out.println(st);
		Dimension size=welead.getSize();
		int hight=size.height;
		int width=size.width;
		System.out.println("height");
		String actul=welead.getAttribute("value");
		if(actul.isBlank()) {
			System.out.println("blank is passs");

		}else {
			System.out.println("blank is fail");

		}
		welead.sendKeys("admin");
		String value=welead.getAttribute("value");
		System.out.println(value);


		WebElement wepassword =driver.findElement(By.xpath("//input[@type='password']"));
		if(wepassword.isDisplayed()){
			System.out.println("password inputbox is Displayed--pass "); 
		}else {
			System.out.println("passord inputbox is not Displayed--fail");
		}



	} 



	public static void equalmethode() {
		String name ="rajan";
		String name1="kumar";
		if(name.equals(name1)) {
			System.out.println("match");
		}else {
			System.out.println("mismatch");



		}

	}
}
