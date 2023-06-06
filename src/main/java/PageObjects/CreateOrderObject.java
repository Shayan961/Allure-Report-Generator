package PageObjects;

import org.openqa.selenium.By;

public class CreateOrderObject extends BaseClass{


    public static String createneworder_btn = "#ctl00_cphBody_divCreateOrderDD > button";
    public static String optionappraisal = "#ctl00_cphBody_ddCreateOrder > li:nth-child(2) > a";

    public static void click_createneworder_btn()
    {
        driver.findElement(By.cssSelector(createneworder_btn)).click();
    }

    public static void click_optionappraisal()
    {
        driver.findElement(By.cssSelector(optionappraisal)).click();
    }
}
