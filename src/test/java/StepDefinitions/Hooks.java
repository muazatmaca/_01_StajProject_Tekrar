package StepDefinitions;

import Utility.GWD;
import io.cucumber.java.After;

public class Hooks {
    @After
    public void after(){
        GWD.quitDriver();
    }

}
