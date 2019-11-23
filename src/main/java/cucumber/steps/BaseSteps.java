package cucumber.steps;

import HW11.MainPage;
import HW11.RegistrationPage;
import HW11.SignInPage;
import cucumber.utils.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class BaseSteps {
    protected WebDriver driver;
    protected final Properties config = Config.loadProperties("test.feature.properties");

    protected MainPage mainPage;
    protected RegistrationPage registrationPage;
    protected SignInPage signInPage;

    public BaseSteps() {
        if (config.getProperty("browser").toLowerCase().equals("chrome")) {
            WebDriverManager
                    .chromedriver()
                    .version(config.getProperty("chromedriver.version"))
                    .setup();
            driver = new ChromeDriver();
        } else if (config.getProperty("browser").toLowerCase().equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
    }
}