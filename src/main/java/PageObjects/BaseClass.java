package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


    public static WebDriver driver;

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver", "E:\\Project\\Allure\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\Users\Lenovo\Documents\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://18.188.38.38/login");
    }




}
