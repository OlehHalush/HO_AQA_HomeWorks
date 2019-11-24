package HW12_TestNG;

import HW11.Account;
import HW11.MainPage;
import HW11.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 extends BeforeAndAfter {
    @Test
    public void class2Test1() {
        System.out.println("class2Test1");
    }

    @Test
    public void class2Test2() {
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
        System.out.println("class2Test2");
    }

    @Test
    public void class2Test3() {
        System.out.println("class2Test3");
    }

    @Test
    public void class2Test4() {
        System.out.println("class2Test4");
    }

    @Test
    public void class2Test5() {
        System.out.println("class2Test5");
    }
}