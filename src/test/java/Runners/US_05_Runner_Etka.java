package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_05_Etka.feature"},
        glue = {"StepDefinitions"}

)
public class US_05_Runner_Etka extends AbstractTestNGCucumberTests {
}
