package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_08_Zeynep.feature"},
        glue = {"StepDefinitions"}
)
public class US_08_Runner_Zeynep extends AbstractTestNGCucumberTests {
}
