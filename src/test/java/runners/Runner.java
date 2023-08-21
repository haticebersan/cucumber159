package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//path of feature file
        glue = "stepdefinitions",//path of the step definitions
        tags = "@so2",
        dryRun = true //dryRun is used to check if there is any MISSING JAVA CODE(STEP DEFINITIONS)


)
public class Runner {
}
