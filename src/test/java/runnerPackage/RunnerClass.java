package runnerPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features=".//loginfeature/login.feature",
			glue="stepDefnations",
			dryRun=false,
			monochrome=true,
			plugin= {"pretty","html:test-output"}
			)

	public class RunnerClass {
}
