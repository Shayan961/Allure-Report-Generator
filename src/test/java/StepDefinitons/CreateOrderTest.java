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
        String expectedUrl = BaseClass.BaseURL + "/AddAppraisal.aspx";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals("Expected URL doesn't match the actual URL", expectedUrl, actualUrl);
    }

    @When("user enter client")
    public void user_enter_client() {

        CreateOrderObject.enter_client_name("AB Client");

    }
    @When("user enter transaction type")
    public void user_enter_transaction_type() {

        CreateOrderObject.enter_transaction("Acquisition");

    }
    @When("user enter address")
    public void user_enter_address() {
        CreateOrderObject.property_address("CONDO","1 Infinite Loop","California","95014","Cupertino");

    }
    @When("user enter product")
    public void user_enter_product() {
        CreateOrderObject.user_enter_product(2);
    }
    @When("user check supporting doc radio button")
    public void user_check_supporting_doc_radio_button() {
        CreateOrderObject.check_supportingdoc_btn();

    }
    @When("user click on continue button")
    public void user_click_on_continue_button()
    {
        CreateOrderObject.click_continue_btn();
    }
    @When("user click on confirm button")
    public void user_click_on_confirm_button()
    {
        CreateOrderObject.confirm_btn();
    }

    @Then("Order should be created successfully")
    public void Order_should_be_created_successfully()
    {
        String expectedText = BaseClass.BaseURL + "/ViewAppraisal.aspx";
        String CurrentURL = driver.getCurrentUrl();
        Assert.assertTrue(CurrentURL.contains(expectedText));
    }


    @When("user click on action button")
    public void user_click_on_action_button()
    {

    }

    @When("user select submit submit appraisal report")
    public void user_select_submit_submit_appraisal_report()
    {

    }

    @When("user should be redirected to the SubmitAppraisal page")
    public void user_should_be_redirected_to_the_submit_appraisal_page()
    {

    }

    @When("user click on choose file button")
    public void user_click_on_choose_file_button()
    {

    }

    @When("user click on submit report button")
    public void user_click_on_submit_report_button()
    {

    }
}

