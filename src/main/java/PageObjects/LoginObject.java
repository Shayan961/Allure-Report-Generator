package PageObjects;

import org.openqa.selenium.By;

public class LoginObject extends BaseClass {



    public static String Username = "ctl00_cphBody_Login1_UserName";
    public static String Password = "ctl00_cphBody_Login1_Password";
    public static String Loginbutton = "ctl00_cphBody_Login1_LoginButton";


    public static void enterUsername(String username)
    {
        driver.findElement(By.id(Username)).sendKeys(username);
    }

    public static void enterPassword(String password)
    {
        driver.findElement(By.id(Password)).sendKeys(password);
    }

    public static void clickLoginbutton( )
    {
        driver.findElement(By.id(Loginbutton)).click();
    }






}
