package test.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;  
import org.junit.runner.RunWith;  

@RunWith(Cucumber.class)  
@CucumberOptions(features = "src/test/java/resources", strict = true, monochrome = true, plugin = { "pretty" })
public class RunCucumberTest { }