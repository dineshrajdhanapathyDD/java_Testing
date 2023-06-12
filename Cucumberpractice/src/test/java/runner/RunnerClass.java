package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)

@CucumberOptions(features="Featurefile/OpenGoogle.feature", glue ="stepDefinitions" )


public class RunnerClass {
	
	//it should combine the feature file and the step definition
	//runner define
	

}
