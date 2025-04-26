
package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@target/failed_scenarios.txt", glue="stepDefinitions",
//tags = "@Checkout or @Search", 
plugin = {"html:target/cucumber.html", "json:target/cucumber.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"rerun:target/failed_scenarios.txt"})
//"xml:target/cucumber.xml"})
//, dryRun=true )
public class FailedTestRunner extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel=true) 
	public Object [][] scenarios()
	{
		return super.scenarios();
	}

}
