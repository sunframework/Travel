package com.org.team.app.stepdefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features/",
        plugin = {"pretty", "json:target/cucumber-report/cucumber-report.json","junit:target/surefire-reports/TEST-TestSuite.xml","html:target/cucumber-reports"},
        tags = "@SystemTest")

public class HooksFile {

}
