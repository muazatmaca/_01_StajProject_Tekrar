package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_02_Aynur.feature"},
        glue = {"StepDefinitions"})

public class US_02_Runner_Aynur extends AbstractTestNGCucumberTests {
}