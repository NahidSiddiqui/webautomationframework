package core;

import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;

/**
 * Created by amayah on 16/12/2017.
 */
public class Hooks {

    static GetWebDriver driver = new GetWebDriver();
    static WebDriver DRIVER;

    @Before
    public static WebDriver setADriver(){

        if(ConfigurationSettings.browserType.contains("firefox")){
            DRIVER = driver.FfoxDriver();
        }else if(ConfigurationSettings.browserType.contains("safari")){
            DRIVER = driver.SafDriver();
        }else if (ConfigurationSettings.browserType.contains("chrome")){
            DRIVER = driver.ChrDriver();
        }
        return DRIVER;
    }
}
