package org.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\"
		+ "mavenproject\\FeatureFiles\\Facebook.feature",glue="org.steps",dryRun=false)

public class RunnerClass {
	

}
