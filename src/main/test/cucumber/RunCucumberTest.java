package cucumber;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/test",
        monochrome = true,
        tags = "@TestScenario1",
        glue = {"cucumber.steps"}
)

public class RunCucumberTest {
}