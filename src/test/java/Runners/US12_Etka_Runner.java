package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US_12_Etka.feature"},
        glue = {"StepDefinitions"}

)
public class US12_Etka_Runner extends AbstractTestNGCucumberTests {
}


