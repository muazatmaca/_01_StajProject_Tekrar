package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_03_Aynur.feature"},
        glue = {"StepDefinitions"})

public class US_03_Runner_Aynur {
}
