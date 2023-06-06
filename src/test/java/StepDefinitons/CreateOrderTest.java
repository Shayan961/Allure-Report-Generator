package StepDefinitons;

import PageObjects.BaseClass;
import PageObjects.CreateOrderObject;
import PageObjects.LoginObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.AllureId;
import io.qameta.allure.Description;
import org.junit.Assert;
import org.junit.Test;

public class CreateOrderTest extends BaseClass {

    @Given("I am on create order dropdown")
    @AllureId("1")
    @Description("verify field")
    @Test
    public void I_am_on_create_order_dropdown()
    {
        //sleep(9000);
        CreateOrderObject.click_createneworder_btn();
    }
    @When("I select appraisal option")
    @AllureId("2")
    @Description("verify field")
    @Test
    public void I_select_appraisal_option()
    {
        //sleep(9000);
        CreateOrderObject.click_optionappraisal();
    }
    @Then("I should be redirected to the create order page")
    @AllureId("3")
    @Description("verify Create Order URL")
    @Test
    public void I_should_be_redirected_to_the_create_order_page()
    {
        //sleep(9000);
        String expectedUrl = "https://vllenderspr1.spurams.com/AddAppraisal.aspx";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals("Expected URL doesn't match the actual URL", expectedUrl, actualUrl);
    }


    @Given("I am on create order page")
    public void i_am_on_create_order_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enter client")
    public void user_enter_client() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enter transaction type")
    public void user_enter_transaction_type() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enter address")
    public void user_enter_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user enter product")
    public void user_enter_product() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click on continue button")
    public void user_click_on_continue_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
