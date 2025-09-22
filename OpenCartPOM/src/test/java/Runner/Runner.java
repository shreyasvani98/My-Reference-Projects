package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
	features = "src//test//resources//Features//",
	glue= {"Stepdefs"},
	dryRun=false, 
	monochrome=true,
	plugin= {//"pretty", //gives info about what is executing in console	
			"html:target/htmlReports.html",
		    "json:target/jsonReports.json",
			"junit:target/junitReports.xml"
			}
//	tags= {""}
)
public class Runner extends AbstractTestNGCucumberTests
{
		
}
