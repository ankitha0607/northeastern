package northeastern;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome = true,
        features = "C:\\Users\\ANKITHA\\Desktop\\java-selenium\\northeastern\\src\\test\\java\\northeastern\\featurefile.feature",
        //tags = "@Test1 or @Test2",
        glue = "/northeastern"
        
        
		)
public class runTest{
}