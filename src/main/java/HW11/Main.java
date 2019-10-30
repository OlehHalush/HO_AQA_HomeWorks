package HW11;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com");
        MainPage mainPage = new MainPage(driver);
        RegistrationPage registrationPage = new RegistrationPage(driver);

        Account account = new Account.AccountBuilder()
                .withGender("Mr")
                .withCustomerFirstName("Oleh")
                .withCustomerLastName("Halush")
                .withCustomerPassword("123123123")
                .withAddressFirstName("Oleh")
                .withAddressLastName("Halush")
                .withAddress("Some street 5/23")
                .withCity("Lviv")
                .withZipCode("12345")
                .withMobilePhone("123123123")
                .withAlias("My alias")
                .build();

        mainPage.clickSignIn()
                .enterEmail()
                .clickCreateAccountButton()
                .fillAccount(account)
                .clickRegisterButton();

        Assert.assertEquals("There is 1 error", registrationPage.getErrorText());
        driver.quit();
    }
}