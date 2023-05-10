import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(plugin = { "html:target/results.html", "message:target/results.ndjson" },
        features = "src/test/resources/features",
        glue = "org.example.steps",
        tags = "@Smoke")
@Test(groups = "smoke", dataProvider = "data")
public class RunCucumberTest extends AbstractTestNGCucumberTests {
}