package StepDefinitons;


import org.junit.Assert;
import PageObjects.BaseClass;
import PageObjects.LoginObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class LoginTest extends BaseClass {


    @Test
    @Given("I am on the login page")
    @AllureId("1")
    @Description("verify url should open successfully")
    @Severity(SeverityLevel.BLOCKER)
    public void I_am_on_the_login_page()
    {
        setDriver();

// Step definition code goes here
    }

    @When("I enter valid username")
    @AllureId("2")
    @Description("verify input fields")
    @Test
    public void I_enter_valid_username() {
        //sleep(9000);
        LoginObject.enterUsername("amsadmin");

    }

    @When("I enter valid password")
    @AllureId("3")
    @Description("verify input fields")
    @Test
    public void I_enter_valid_password() {
        //sleep(9000);

        LoginObject.enterPassword("Dir@1234");

    }

    @When("I click the login button")
    @AllureId("4")
    @Description("verify input fields")
    @Test
    public void I_click_the_login_button() {
        //sleep(9000);

        LoginObject.clickLoginbutton();

    }

    @Then("I should be redirected to the dashboard")
    @AllureId("5")
    @Description("verify URL")
    @Test
    public void I_should_be_redirected_to_the_dashboard() {
        String expectedUrl = "https://vllenderspr1.spurams.com/AdminDashboard.aspx";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals("Expected URL doesn't match the actual URL", expectedUrl, actualUrl);
    }

    @When("I enter an invalid username")
    @AllureId("2")
    @Description("verify input fields")
    @Test
    public void I_enter_an_valid_username() {
        //sleep(9000);
        LoginObject.enterUsername("amasadmin");

    }
    @Then("I should see an error message")
    @AllureId("5")
    @Description("verify URL")
    @Test
    public void I_should_see_an_error_message() {
        String expectedErrorMessage = "Your login attempt was not successful. Please try again."; // Update with your expected error message
        String actualErrorMessage = driver.findElement(By.cssSelector("#ctl00_cphBody_Login1 > tbody > tr > td > table > tbody > tr:nth-child(5) > td")).getText(); // Update with the correct selector for your error message element

        Assert.assertEquals("Expected error message doesn't match the actual error message", expectedErrorMessage, actualErrorMessage);
    }


}
