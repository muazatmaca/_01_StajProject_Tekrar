package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_11_Ebru.feature"},
        glue = {"StepDefinitions"}
)
public class US_11_Runner_Ebru extends AbstractTestNGCucumberTests {
}
