package Runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_04_Aynur.feature"},
        glue = {"StepDefinitions"})

public class US_04_Runner_Aynur {
}
