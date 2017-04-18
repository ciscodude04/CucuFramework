package CucuFramework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Cisco on 2/25/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"}, glue={"step_definitions"}
)
public class RunTest {

}
