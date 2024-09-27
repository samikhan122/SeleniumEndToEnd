package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/alikhan/IdeaProjects/demo1/src/test/resources/features", //the path of the feature files
        glue={"StepDefintions"}, //the path of the step definition files
        plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"}, //"json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
        monochrome = true //display the console output in a proper readable format
        //strict = true, //it will check if any step is not defined in step definition file
        //dryRun = false //to check the mapping is proper between feature file and step def file
       // tags = {"@SmokeTest"  "RegressionTest"}
)


public class TestRunner {
}
