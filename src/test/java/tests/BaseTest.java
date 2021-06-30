package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.Browser;
import utils.DriverCreator;

public class BaseTest {
    protected static final String BASE_URL = "http://eli.am";

    @BeforeMethod
    void setUp() {
        DriverCreator.initializeDriver(Browser.CHROME);}
    @AfterMethod
    void tearDown() {DriverCreator.quitDriver();}
}
