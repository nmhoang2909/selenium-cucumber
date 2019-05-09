package utils;

import bases.MasterDriver;
import enums.DriverType;
import utils.drivermanager.ChromeDriverManager;
import utils.drivermanager.FirefoxDriverManager;

public class DriverFactory {
    private static MasterDriver masterDriver;

    public static MasterDriver getMasterDriver(DriverType driverType) {
        switch (driverType) {
            case FIREFOX:
                masterDriver = new FirefoxDriverManager();
                break;
            case CHROME:
                masterDriver = new ChromeDriverManager();
                break;
            case IE:
                break;
            default:
                masterDriver = null;
                break;
        }
        return masterDriver;
    }
}
