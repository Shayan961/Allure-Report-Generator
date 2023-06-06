package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {


    public static WebDriver driver;

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Spursol-Shayan\\Documents\\WebDriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.get("https://vllenderspr1.spurams.com/");
    }

}
