package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateOrderObject extends BaseClass{


    public static String createneworder_btn = "#ctl00_cphBody_divCreateOrderDD > button";
    public static String optionappraisal = "#ctl00_cphBody_ddCreateOrder > li:nth-child(2) > a";
    public static String clientfield = "ctl00_cphBody_drpLender";
    public static String Transaction = "ctl00_cphBody_drpTransactionType";
    public static String Property_Type = "ctl00_cphBody_drpPropertyType";
    public static String Property_Address = "ctl00_cphBody_txtPropertyAddress";
    public static String Property_City = "ctl00_cphBody_txtPropertyCity";
    public static String Property_State = "ctl00_cphBody_drpPropertyState";
    public static String Property_Zip = "ctl00_cphBody_txtPropertyZip";
    public static String Product = "ctl00_cphBody_drpAppraisalType";
    public static String SupportingDocRadioButton = "ctl00_cphBody_rdoLstSupportingDocuments_1";
    public static String Continue_btn = "ctl00_cphBody_btnContinue";
    public static String Confirm_btn = "ctl00_cphBody_btnConfirm";

    public static void click_createneworder_btn()
    {

        driver.findElement(By.cssSelector(createneworder_btn)).click();
    }

    public static void click_optionappraisal()
    {

        driver.findElement(By.cssSelector(optionappraisal)).click();
    }

    public static void enter_client_name(String client)
    {
//        WebElement dropdown_client=driver.findElement(By.id(clientfield));
//        Select dropdown = new Select(dropdown_client);
//        dropdown.selectByIndex(4);
        driver.findElement(By.id(clientfield)).sendKeys(client);
    }


    public static void enter_transaction(String transaction)
    {
        driver.findElement(By.id(Transaction)).sendKeys(transaction);
    }

    public static void property_address (String Ptype, String PAddress, String PState, String Pzip, String Pcity)

    {
        WebElement dropdownElement =driver.findElement(By.id(Property_Type));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("32");

        driver.findElement(By.id(Property_Address)).sendKeys(PAddress);
        driver.findElement(By.id(Property_State)).sendKeys(PState);
        driver.findElement(By.id(Property_Zip)).sendKeys(Pzip);
        driver.findElement(By.id(Property_City)).sendKeys(Pcity);

    }

    public static void user_enter_product(int value)
    {

        WebElement dropdownElement = driver.findElement(By.id(Product)); // Replace with the correct selector for your dropdown element
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByIndex(value);

    }

    public static void check_supportingdoc_btn()
    {

        driver.findElement(By.id(SupportingDocRadioButton)).click();
    }
    public static void click_continue_btn()
    {

        driver.findElement(By.id(Continue_btn)).click();
    }
    public static void confirm_btn()
    {

        driver.findElement(By.id(Confirm_btn)).click();
    }

}
