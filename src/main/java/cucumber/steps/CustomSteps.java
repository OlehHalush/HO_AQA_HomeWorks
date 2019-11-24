package cucumber.steps;

import HW11.Account;
import HW11.MainPage;
import HW11.RegistrationPage;
import HW11.SignInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class CustomSteps extends BaseSteps {
    @Given("^open browser$")
    public void openBrowser() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("^open main page and click Sign In button$")
    public void openMainPage() {
        driver.get(config.getProperty("baseurl"));
        mainPage = new MainPage(driver);
        mainPage.clickSignIn();
    }

    @And("^I enter email and click Create account button$")
    public void enterEmailAndClickCreateAccount() {
        signInPage = new SignInPage(driver);
        signInPage.enterEmail();
        signInPage.clickCreateAccountButton();
    }

    @And("^fill in account fields$")
    public void fillInAccountFields() {
        registrationPage = new RegistrationPage(driver);
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
        registrationPage.fillAccount(account);
    }

    @When("^I click Register button$")
    public void clickRegisterButton() {
        registrationPage = new RegistrationPage(driver);
        registrationPage.clickRegisterButton();
    }

    @Then("^I see error message: \"([^\"]*)\"$")
    public void checkErrorMessage(String errorMessage) {
        registrationPage = new RegistrationPage(driver);
        Assert.assertEquals(errorMessage, registrationPage.getErrorText());
    }

    @And("^close the browser$")
    public void cleanCookiesAndCloseBrowser() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}