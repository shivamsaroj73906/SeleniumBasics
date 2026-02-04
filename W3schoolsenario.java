package seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class W3schoolsenario {

	public static void main(String[] args) {

		//page();
		html(); 


	}



	//		ChromeDriver driver=new ChromeDriver();
	//		driver.get("https://www.w3schools.com/");
	//		Actions actobj=new Actions(driver);
	//		actobj.scrollByAmount(0, 12000).build().perform();
	//		WebElement one_frame=driver.findElement(By.xpath("//iframe[@src='/howto/tryhow_js_slideshow_ifr.htm']"));
	//		driver.switchTo().frame(one_frame);
	//		WebElement	objtext=driver.findElement(By.xpath("//div[text()='Caption Text']"));
	//		String	we_frame=objtext.getText(); 
	//		System.out.println(we_frame);
	//		driver.switchTo().defaultContent();
	//		WebElement	we_padding=driver.findElement(By.xpath("//div[@id='howto_padding']//h2[@class='textsmaller']"));
	//		String	h2print=we_padding.getText();
	//		System.out.println(h2print);

	//		driver.findElement(By.xpath("//a[@class='next']")).click();

	//   
	//
	//        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
	//     WebElement we_frame=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
	//     driver.switchTo().frame(we_frame);
	//     
	//   WebElement  i2_frame=driver.findElement(By.xpath("//iframe[@src='https://www.w3schools.com']"));
	//   driver.switchTo().frame(i2_frame);
	//      
	//     WebElement i_frame=driver.findElement(By.xpath("//a[text()='HTML']"));
	//     i_frame.click();
	//    
	//     
	//     driver.switchTo().parentFrame();
	//    
	//    WebElement thaframe=driver.findElement(By.xpath("//h1[text()='The iframe element']"));
	//   String print=thaframe.getText();
	//   System.out.println(print);
	//	}

	public static void page() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement we_page=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(we_page);
		WebElement we_demo_iframe=driver.findElement(By.xpath("//iframe[@src='demo_iframe.htm']"));
		driver.switchTo().frame(we_demo_iframe);
		WebElement we_this_page=driver.findElement(By.xpath("//h1[text()='This page is displayed in an iframe']"));
		String	prit1= we_this_page.getText();
		System.out.println(prit1);
	}


	public static void html() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		WebElement	htMl=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(htMl);
		WebElement	we_i2frame=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
		driver.switchTo().frame(we_i2frame);
		driver.switchTo().parentFrame();
		WebElement	print_html=driver.findElement(By.xpath("//h2[text()='HTML Iframes']"));
		String	print=print_html.getText();
		System.out.println(print);
		


	}





}

