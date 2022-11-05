package com.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",//Feature File Location 
     glue = {"com.stepdefinitions"}, //Steps Location
     plugin = {"pretty","html:target/cucumber.html"},// to generate different type of report
     
     monochrome = true,//display the output in readable format
    dryRun = false, // finds the undefined steps only {not executes the other steps}
    tags = "@signup")


public class CucumberRunner {

}