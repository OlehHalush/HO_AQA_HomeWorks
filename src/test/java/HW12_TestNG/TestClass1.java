package HW12_TestNG;

import HW11.*;
import org.testng.Assert;
import org.testng.annotations.Test;

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

public class TestClass1 extends BeforeAndAfter {
    @Test
    public void class1Test1() {
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
        System.out.println("class1Test1");
    }

    @Test
    public void class1Test2() {
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