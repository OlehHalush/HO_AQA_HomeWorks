package HW11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverFactory {
    private WebDriverFactory() {
    }

    public static WebDriver getDriver(DriverType type) {
        switch (type) {
            case CHROME:
                WebDriverManager.chromedriver().version("78").setup();
                WebDriver chromeDriver = new ChromeDriver();
                return chromeDriver;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                WebDriver firefoxDriver = new FirefoxDriver();
                return firefoxDriver;
            case IE:
                WebDriverManager.iedriver().setup();
                WebDriver ieDriver = new InternetExplorerDriver();
                return ieDriver;
            default:
                throw new IllegalArgumentException("sSuch browser is not implemented");
        }
    }
}