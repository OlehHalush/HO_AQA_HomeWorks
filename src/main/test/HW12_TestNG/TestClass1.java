package HW12_TestNG;

import HW11.DriverType;
import HW11.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/*
1. Create a new Maven project;
2. Add TestNG dependency and Selenium Web Driver;
3. Add several test classes and 4-5 tests to each class.
4. Write @BeforeTest method where you should create your instance of a
WebDriver.
5. Write @AfterTest method where you should close your browser.
6. Add a testng.xml configuration file.
7. Configure the test suite to run all tests from the first class and only two from the second.
8. Create a @DataProvider method to generate some data for your tests.
9. Add your data provider to any test you wish.
*/

public class TestClass1 {

    public WebDriver driver;
    @BeforeTest
    public void createDriverInstance() {
        driver = WebDriverFactory.getDriver(DriverType.CHROME);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://automationpractice.com");
    }

    @AfterTest
    public void closeDriver(){
        driver.close();
        driver.quit();
    }

    @Test
    public void class1Test1() {
        System.out.println("class1Test1");
    }

    @Test
    public void class1Test2() {
        System.out.println("class1Test2");
    }

    @Test
    public void class1Test3() {
        System.out.println("class1Test3");
    }

    @Test
    public void class1Test4() {
        System.out.println("class1Test4");
    }

    @Test
    public void class1Test5() {
        System.out.println("class1Test5");
    }
}