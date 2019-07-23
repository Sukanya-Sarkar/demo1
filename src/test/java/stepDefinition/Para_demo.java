package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Para_demo {
	WebDriver driver=null;
	@Given("User is open the application")
	public void user_is_open_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_b6b.00.10\\Desktop\\browsers and drivers\\chromedriver.exe");
		  driver= new ChromeDriver();
		  String url="http://10.232.237.143:443/TestMeApp/fetchcat.htm";
		  driver.get(url);
		
	}

	@When("User click on the signin link")
	public void user_click_on_the_signin_link() {
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("SignIn")).click();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String username, String password) throws InterruptedException {
			driver.findElement(By.name("userName")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("Login")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//a[@href='logout.htm']")).click();
			
	}

	@Then("message displayed login successful")
	public void message_displayed_login_successful() {
	  System.out.println("Login successful! page name is : "+driver.getTitle());
	  driver.close();
	}

}
