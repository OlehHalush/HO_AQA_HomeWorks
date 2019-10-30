package HW11;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com");
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);
        
        mainPage.clickSignIn()
                .enterEmail()
                .clickCreateAccountButton()
                .selectTitle("Mr")
                .enterCustomerFirstName("Oleh")
                .enterCustomerLastName("Halush")
                .enterCustomerEmail()
                .enterCustomerPassword("123123123")
                .enterFirstNameAddress("Oleh")
                .enterLastNameAddress("Halush")
                .enterAddress("Some street 5/123")
                .enterCity("Lviv")
                .enterZipCode("12345")
                .enterMobilePhone("123123123")
                .enterAlias("My alias")
                .clickRegisterButton();

        Assert.assertEquals("There is 1 error", registrationPage.getErrorText());
        driver.quit();
    }
}
