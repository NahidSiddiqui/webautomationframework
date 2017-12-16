package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * Created by amayah on 16/12/2017.
 */
public class GetWebDriver {

    WebDriver driver;
    String dir = System.getProperty("user.dir");
    String OSType = System.getProperty("OSType");


    public WebDriver FfoxDriver(){
        System.setProperty("webdriver.gecko.driver", dir + "/drivers/geckodriver");
        driver = new FirefoxDriver();
        return driver;
    }

    //Driver for Safari browser
    public WebDriver SafDriver(){
        driver = new SafariDriver();
        return driver;
    }

    //Driver for Chrome browser
    public WebDriver ChrDriver(){
        String executable = "";
        if (OSType.contains("windows")){
            executable = ".exe";
        }
        System.setProperty("webdriver.chrome.driver", dir + "/drivers/chromedriver" + OSType + executable);
        driver = new ChromeDriver();
        return driver;
    }

}
