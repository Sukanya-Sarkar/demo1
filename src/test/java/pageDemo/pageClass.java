package pageDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageClass {
	WebDriver driver=null;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
	By pwd=By.name("Password");
	By login=By.xpath("//input[@value='Log in']");
	
	public pageClass(WebDriver driver)
	{
		this.driver=driver;
	}
	public void clickOnSignIn()
	{
		driver.findElement(lnc).click();
	}
	public void username(String usernm)
	{
		driver.findElement(uname).sendKeys(usernm);
	}
	public void password(String passwd)
	{
		driver.findElement(pwd).sendKeys(passwd);
	}
	public void loginButton()
	{
		driver.findElement(login).click();
	}
	
}
