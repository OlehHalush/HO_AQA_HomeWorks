package HW11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class SignInPage {
    private WebDriver driver;

    @FindBy(id = "email_create")
    private WebElement emailField;

    @FindBy(id = "SubmitCreate")
    private WebElement createAccountButton;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public SignInPage enterEmail() {
        Random randomGenerator = new Random();
        int randomInt1 = randomGenerator.nextInt(1000);
        int randomInt2 = randomGenerator.nextInt(1000);
        emailField.clear();
        emailField.sendKeys("user" + randomInt1 + "@gmail" + randomInt2 + ".com");
        return this;
    }

    public RegistrationPage clickCreateAccountButton() {
        createAccountButton.click();
        return new RegistrationPage(driver);
    }
}