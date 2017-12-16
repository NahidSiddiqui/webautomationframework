package core;

/**
 * Created by amayah on 16/12/2017.
 */
public class ConfigurationSettings {

    public static final String browserType;

    static{
        browserType = System.getProperty("browserType");
    }

}
