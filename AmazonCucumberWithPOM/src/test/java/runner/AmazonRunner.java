package runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,
				 strict=true,
                 monochrome=false,
                 plugin= {
                		  "html:target/site/cucumber-html",
                		  "json:target/cucumber1.json"},

                 features={"src/test/java/"},
   				 glue={"stepdefinition"}
   	)


public class AmazonRunner {
	

}
