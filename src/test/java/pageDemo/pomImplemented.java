package pageDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class pomImplemented {

	public static void main(String args[]) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 //pageClass object=new pageClass(driver);
	 driver.get("http://demowebshop.tricentis.com");
	 driver.manage().window().maximize();
	 /*object.clickOnSignIn();
	 object.username("happiness641996@gmail.com");
	 object.password("skdemowebshop");
	 object.loginButton();*/
	pageFactoryClass obj=PageFactory.initElements(driver,pageFactoryClass.class);
	 obj.LoginProcess("happiness641996@gmail.com","skdemowebshop");
	 
}
	
}