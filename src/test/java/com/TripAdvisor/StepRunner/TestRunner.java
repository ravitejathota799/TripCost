package com.TripAdvisor.StepRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = { "src/test/resources/Features",}, glue = "com.TripAdvisor.StepDefinitions", tags=("@smoke"),plugin = {"pretty", "rerun:target/rerun.txt","html:Cucumber-reports/report.html",
				 }, dryRun = false, monochrome = true)


public class TestRunner {

	public TestRunner() {
		// TODO Auto-generated constructor stub
	}

}
