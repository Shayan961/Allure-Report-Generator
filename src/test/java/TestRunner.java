import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"D:\\Shayan Repo\\CrossCheck_Automation_Selenium_Cucumber\\src\\test\\resources\\Features\\Login.feature","D:\\Shayan Repo\\CrossCheck_Automation_Selenium_Cucumber\\src\\test\\resources\\Features\\CreateOrder.feature"},
        //glue = {"com.example.steps"},
        plugin = {"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
public class TestRunner {
}

