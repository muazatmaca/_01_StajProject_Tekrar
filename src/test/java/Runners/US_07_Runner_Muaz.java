package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_07_Muaz.feature"},
        glue = {"StepDefinitions"}
)
public class US_07_Runner_Muaz extends AbstractTestNGCucumberTests {
}
