package core;

/**
 * Created by amayah on 16/12/2017.
 */
public class ConfigurationSettings {

    public static final String browserType;
    public static final String OSType;

    static{
        browserType = System.getProperty("browserType");
        OSType = System.getProperty("OSType");
    }

}
