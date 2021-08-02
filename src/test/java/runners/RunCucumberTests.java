package runners;

//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(glue={"com.tau.runners.steps"}, features = "src/test/resources", plugin = { "pretty", "html:target/site/cucumber-pretty",
//        "json:target/cucumber.json" })
//public class RunCucumberTests {
//}

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class RunCucumberTests extends AbstractTestNGCucumberTests{

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}