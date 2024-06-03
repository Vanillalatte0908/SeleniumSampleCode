public class RunCucumber {
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/otomasi/resources/features", glue = "OpenGoogle")
public class RunCucumber {
}
}