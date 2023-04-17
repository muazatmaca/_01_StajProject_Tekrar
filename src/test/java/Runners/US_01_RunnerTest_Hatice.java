package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_01_Hatice.feature"},
        glue = {"StepDefinitions"}
)
public class US_01_RunnerTest_Hatice extends AbstractTestNGCucumberTests {
}
