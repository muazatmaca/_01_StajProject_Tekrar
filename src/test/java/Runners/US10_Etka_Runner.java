package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features = {"src/test/java/FeatureFiles/US_10_Etka.feature"},
            glue = {"StepDefinitions"}

    )
    public class US10_Etka_Runner extends AbstractTestNGCucumberTests {
    }


