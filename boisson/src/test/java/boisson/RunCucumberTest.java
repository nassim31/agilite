package boisson;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/dojo", strict = true, monochrome = true, plugin = {"pretty", "junit:target/cucumber.xml"})
public class RunCucumberTest { }
