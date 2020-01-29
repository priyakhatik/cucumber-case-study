package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featurefile",glue = { "stepDefinition"},tags= "@login,@search",
plugin= {"pretty","json:target/cucumber.json"})

public class RunnerClass {

}
