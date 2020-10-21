package cucumberExecution;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "src/test/java/features",
					glue     = "stepDef",
					//tags     = "@sanityTest",
					plugin   = {"pretty"
							,"html:target/AutomationTestresult.html"
							,"json:target/cucumberReport.json"
							,"junit:target/cucumberTestReport.xml"
					}
					,dryRun=true
					,monochrome = true
					,strict = true
)
public class TestRunner {

}
