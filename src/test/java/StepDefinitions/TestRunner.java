package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",

glue= {"StepDefinitions"},

monochrome=true, 

//plugin = {"pretty","html:target/HtmlReports/"},
//plugin = {"pretty","json:target/JsonReports/report.json"},
//plugin = {"pretty","junit:target/JunitReports/report.xml"},
plugin = {"pretty","html:target/HtmlReports/","json:target/JsonReports/report.json","junit:target/JunitReports/report.xml"},

tags = "@smoketest"
)





public class TestRunner {
	

}
