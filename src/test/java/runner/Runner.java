package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) 
@CucumberOptions(
        
        features = "src/test/resources",
        glue = "stepDefinitions",
        tags = "@smoke",
        dryRun = false,
        plugin = {"pretty",
                    "html:target/default-cucumber-reports.html",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt"

            }
)

    public class Runner {


    }

            
