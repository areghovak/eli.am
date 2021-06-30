package utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverCreator {

    static WebDriver driver;

    public static WebDriver getDriver() {return driver; }

    public static void initializeDriver(Browser browser) {
        switch (browser) {
            case CHROME: {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }
            case FIREFOX: {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }

            default:
                System.out.println("Unrecognizable browser");
        }
    }
    public static void quitDriver() {driver.quit(); }

}
