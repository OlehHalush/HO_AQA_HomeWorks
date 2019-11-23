package cucumber;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/test",
        monochrome = true,
        tags = "@TestScenarioV1",
        glue = {"src.main.java"}
)

public class RunCucumberTest {
}