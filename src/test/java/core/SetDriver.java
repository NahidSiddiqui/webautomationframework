package core;

import org.openqa.selenium.WebDriver;

/**
 * Created by amayah on 16/12/2017.
 */
public abstract class SetDriver {

    WebDriver driver;

    public WebDriver beforeHook(){
        driver = Hooks.setADriver();
        return driver;
    }
}
