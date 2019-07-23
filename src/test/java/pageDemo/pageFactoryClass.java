package pageDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class pageFactoryClass {

	WebDriver driver;
	@FindBy(linkText="Log in") WebElement login;
	@FindBy(how=How.ID,using="Email") WebElement username;
	@FindBy(how=How.NAME,using="Password") WebElement password;
	@FindBy(how=How.XPATH,using="//input[@value='Log in']") WebElement button;

public pageFactoryClass(WebDriver driver) {
this.driver=driver;	
}
public void LoginProcess(String usernae, String passwrd) {
login.click();
username.sendKeys(usernae);
password.sendKeys(passwrd);
button.click();

}
}
