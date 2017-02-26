package CucuFramework;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;
import org.junit.runner.RunWith;

/**
 * Created by Cisco on 2/25/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources"}
)
public class CukeRunner {

}
