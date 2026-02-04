package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Testvesenario {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost:8181/");
		WebElement	weuser=driver.findElement(By.name("user_name"));
		if(weuser.isDisplayed()) {
			System.out.println("user name is visible ---"+"passed");
		}else {
			System.out.println("user name is not visible---"+"falid");
		}
		if(weuser.isEnabled()) {
			System.out.println("username is Enabled---"+"passed");
		}else {
			System.out.println("username is not Enabled---"+"failed");
		}
		String	blank=weuser.getAttribute("value");
		if(blank.equals("")) {
			System.out.println("username is blank---"+"passed");
		}else {
			System.out.println("username is not blank---"+"failed");
		}
		weuser.sendKeys("admin");
		String	value=weuser.getAttribute("value");
		System.out.println(value);

		WebElement	wepassward=driver.findElement(By.name("user_password"));
		if(wepassward.isDisplayed()) {
			System.out.println("userpassword is visible---"+"passed");

		}else {
			System.out.println("userpassword is not visible---"+"failed");
		}
		if(wepassward.isEnabled()) {
			System.out.println("userpassword is Enabled---"+"passed");
		}else {
			System.out.println("userpassword is not Enabled---"+"failed");
		}

		String blank1=wepassward.getAttribute("value");
		if(blank1.equals("")) {
			System.out.println("userpassword is blank---"+"passed");
		}else {
			System.out.println("userpassword is not balnk---"+"faild");
		}
		wepassward.sendKeys("admin");
		String value1=wepassward.getAttribute("value");

		System.out.println(value1);

		//here we are finding a login button with help of findelement method of chromeDriver Class
		WebElement weLoginButton=driver.findElement(By.xpath("//input[@id='submitButton']"));


		if(weLoginButton.isDisplayed()) {
			System.out.println("weLoginButton is visible---"+"passed");

		} 
		else {
			System.out.println("weLoginButton is not visible---"+"failed");
		}
		if(weLoginButton.isEnabled()) {
			System.out.println("weLoginButton is Enabled---"+"passed");
		}else {
			System.out.println("weLoginButton is not Enabled---"+"failed");
		}
		Dimension size=weLoginButton.getSize();
		int hight=size.getHeight();
		int width=size.getWidth();
		int ExpectedHight=24;
		int ExpectedWidth=160;
		if(hight==ExpectedHight && width==ExpectedWidth) {
			System.out.println("Actul and Expected Hight and width matched : Pass");
		}
		else {
			System.out.println("Actul and Expected Hight and width not Matched : fail");

		}
		weLoginButton.click();
		
		WebElement	More=driver.findElement(By.xpath("(//a[@href='javascript:;'])[1]"));
		Actions more1=new Actions(driver);
		more1.moveToElement(More).build().perform();
		
		Thread.sleep(4000);

		WebElement	we_lead=driver.findElement(By.xpath("//a[text()='Leads']"));

		if(we_lead.isDisplayed()) {
			System.out.println("we_lead is visible---"+"passed");
		}
		else {
			System.out.println("we_lead is not visible---"+"failed");
		}
		if(we_lead.isEnabled()) {
			System.out.println("we_lead is Enabled---"+"passed");
		}
		else {
			System.out.println("we_lead is not Enabled---"+"failed");
		}
		we_lead.click();


		WebElement	we_pluse=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
		if(we_pluse.isDisplayed()) {
			System.out.println("we_pluse is visible---"+"passed");
		}
		else {
			System.out.println("we_pluse is not visible---"+"failed");
		}
		if(we_pluse.isEnabled()) {
			System.out.println("we_pluse is Enabled---"+"passed");
		}
		else {
			System.out.println("we_pluse is not Enabled---"+"failed");
		}
		we_pluse.click();

		WebElement	we_fristname_dropdown=driver.findElement(By.xpath("//select[@name='salutationtype']"));
		if(we_fristname_dropdown.isDisplayed()) {
			System.out.println("we_fristname_dropdown is visible---"+"passed");
		}
		else {
			System.out.println("we_fristname_dropdown is not visible---"+"failed");
		}
		if(we_fristname_dropdown.isEnabled()) {
			System.out.println("we_fristname_dropdown is Enabled---"+"passed");
		}
		else {
			System.out.println("we_fristname_dropdown is Enabled---"+"failed");

		}
		Select selobj=new Select(we_fristname_dropdown);
		WebElement frist_value=selobj.getFirstSelectedOption();
		String	actule__seloption=frist_value.getText();
		String Expcted_value_none="--None--";
		if(actule__seloption.equalsIgnoreCase(Expcted_value_none)) {
			System.out.println("Expcred and actule value"+"matched");
		}else {
			System.out.println("Expcred and actule not value"+"matched");
		}
		selobj.selectByVisibleText("Mr.");
		WebElement	we_fiset_value=selobj.getFirstSelectedOption();
		String we_second_value=we_fiset_value.getText();
		String Expcted_value="Mr.";
		if( we_second_value.equalsIgnoreCase(Expcted_value)) {
			System.out.println("we Expcted and actule value"+"mached");
		}else {
			System.out.println("we Expcted and actule value not"+"mached");
		}

		WebElement we_fistname=driver.findElement(By.xpath("//input[@name='firstname']"));
		if( we_fistname.isDisplayed()) {
			System.out.println(" we_fistname is visible---"+"passed");
		}
		else {
			System.out.println(" we_fistname is not visible---"+"failed");
		}
		if( we_fistname.isEnabled()) {
			System.out.println(" we_fistname is Enabled---"+"passed");
		}
		else {
			System.out.println(" we_fistname is Enabled---"+"failed");
		}
		String actualfirstnameblank=we_fistname.getAttribute("value");
		String Excpatedfisrnameblank="";
		if(actualfirstnameblank.equalsIgnoreCase(Excpatedfisrnameblank)==true) {
			System.out.println("it should fist name inputbox blank "+"passed");
		}else {
			System.out.println("it should fist name inputbox blank "+"failed");

		}


		we_fistname.sendKeys("shivam");

		String Actulevalue=we_fistname.getAttribute("value");
		String Exptedvalue="shivam";
		if(Actulevalue.equalsIgnoreCase(Exptedvalue)) {
			System.out.println("Actule and Expted fist name is "+"match");
		}else {
			System.out.println("Actule and Expted fist name is "+"missmatch");
		}
		//////////////////////////BY FistName INPUTBOX/////////////////////////////////
		WebElement welastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		if(welastname.isDisplayed()) {
			System.out.println("we last name is visible"+"passed");
		}else {
			System.out.println("we last name is not visible"+"failed");
		}
		if(welastname.isEnabled()) {
			System.out.println("we last name is Enable"+"passed");
		}else {
			System.out.println("we last name is not Enable"+"failed");
		}
		String fill_actule_value=welastname.getAttribute("value");
		String Expcted__value="";
		if(fill_actule_value.equalsIgnoreCase(Expcted__value)) {
			System.out.println("Expcted and Actule value is"+"mached");
		}else {
			System.out.println("Expcted and Actule value is not"+"mached");
		}
		welastname.sendKeys("Saroj");
		String we_send_text=welastname.getAttribute("value");
		String Excpted_text="Saroj";
		if(we_send_text.equalsIgnoreCase(Excpted_text)) {
			System.out.println("Expcted and Actule value is\"+\"mached"); 
		}else {
			System.out.println("Expcted and Actule value is not\"+\"mached");
		}

		/////////////By LASTNAME INPUTBOX////////////

		WebElement  we_company=driver.findElement(By.xpath("//input[@name='company']"));
		if(we_company.isDisplayed()) {
			System.out.println("we company is visible  passed");
		}else {
			System.out.println("we company is not visible  failed");
		}
		if(we_company.isEnabled()) {
			System.out.println("we company is Enable passed");

		}else {
			System.out.println("we company is not Enable failed");
		}
		String company_actule_value=we_company.getAttribute("value");
		String com_Expcted_value="";
		if(company_actule_value.equalsIgnoreCase(com_Expcted_value)) {
			System.out.println("company Expcted and Actule value mached");
		}else {
			System.out.println("copany Expcted and Actule value not mached");
		}
		we_company.sendKeys("Mahendra");
		String	company_value=we_company.getAttribute("value");
		String company_Expcted_value="Mahendra";
		if(company_value.contentEquals(company_Expcted_value)) {
			System.out.println("company Expcted and Actule is value mached ");
		}else {
			System.out.println("copany Expcted and Actule value not mached");
		}
		//////////////BY COMPANY TEXTBOX///////////
		WebElement we_title	=driver.findElement(By.xpath("//input[@name='designation']"));
		if(we_title.isDisplayed()) {
			System.out.println("title box is visible----passed ");
		}else {
			System.out.println("title box is not visible----failed");
		}
		if( we_title.isEnabled()) {
			System.out.println("title box is Enable---passed");
		}else {
			System.out.println("title box is not Enable---failed");
		}
	String	titlevalue=we_title.getAttribute("value");
	String titExpctedvalue="";
	if(titlevalue.equalsIgnoreCase(titExpctedvalue)) {
		System.out.println("actulevalue and expctedvalue are blanck-----passed");
	}else {
		System.out.println("actulevalue and expctedvalue are not blanck-----failed");
	}
	we_title.sendKeys("this is my fist forme"); 
	String actulevalue=we_title.getAttribute("value");
	String exptedvalue="this is my fist forme";
	if(actulevalue.equalsIgnoreCase(exptedvalue)) {
		System.out.println("actulevalu and expctedvalue are mached----passed");
	}else {
		System.out.println("actulevalu and expctedvalue are not mached----passed");
	}
	
	}
}








