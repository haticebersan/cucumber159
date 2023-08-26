package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",//generate the report on console colorfully
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        features = "./src/test/resources/features",//path of feature file
        glue = {"stepdefinitions","hooks"},//path of the step definitions
      //  tags = "@excel",
        dryRun = true //dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)


)
public class Runner {
}
