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
}
