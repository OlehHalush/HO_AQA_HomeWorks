package HW12_TestNG;

import HW11.DriverType;
import HW11.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BeforeAndAfter {
    public WebDriver driver;

    @BeforeClass
    public void createDriverInstance() {
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterClass
    public void closeDriver() {
        driver.quit();
    }
}