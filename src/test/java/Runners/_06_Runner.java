package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/SP-06_Positions_HRSetup.feature"},
        glue = {"StepDefinitions"}

)
public class _06_Runner extends AbstractTestNGCucumberTests {
}
