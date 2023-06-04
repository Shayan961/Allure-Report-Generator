package PageObjects;

import org.openqa.selenium.By;

public class LoginObject extends BaseClass {



    public static String Firstrname = "Firstname_css";
    public static String LastName = "LastName_css";


    public static void enterUsername(String strUsername){
        driver.findElement(By.id(Firstrname)).sendKeys(strUsername);
    }

    public static void enterPassword(String lastName){
        driver.findElement(By.id(LastName)).sendKeys(lastName);
    }







}
