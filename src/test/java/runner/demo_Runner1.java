package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,features="Features\\tagDemo.Feature", plugin= {"pretty", "html:cucumber-html-report" } ,tags= {"@End2End","@SmokeTest"} )
public class demo_Runner1 {
	
	

}
