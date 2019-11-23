package cucumber.steps;

import HW11.MainPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import java.util.concurrent.TimeUnit;

public class CustomSteps extends BaseSteps {

    @Given("^open browser$")
    public void setUpBrowser() {
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("^open main page$")
    public void openMainPage() {
        driver.get(config.getProperty("baseurl"));
    }

    @And("^close the browser$")
    public void cleanup(){
        if (driver!=null){
            driver.manage().deleteAllCookies();
            driver.close();
        }
    }

    @And("^go to signin page$")
    public void openSignInPage() {
        mainPage = new MainPage(driver);
        mainPage.clickSignIn();
    }

}
