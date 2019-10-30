package HW11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class RegistrationPage {
    private WebDriver driver;


    @FindBy(id = "id_gender1")
    private WebElement titleMr;

    @FindBy(id = "id_gender2")
    private WebElement titleMrs;

    @FindBy(id = "customer_firstname")
    private WebElement customerFirstName;

    @FindBy(id = "customer_lastname")
    private WebElement customerLastName;

    @FindBy(id = "email")
    private WebElement customerEmail;

    @FindBy(id = "passwd")
    private WebElement customerPassword;

    @FindBy(css = "input#firstname")
    private WebElement firstNameAddress;

    @FindBy(css = "input#lastname")
    private WebElement lastNameAddress;

    @FindBy(id = "address1")
    private WebElement address;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "postcode")
    private WebElement zipCode;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhone;

    @FindBy(id = "alias")
    private WebElement alias;

    @FindBy(id = "submitAccount")
    private WebElement registerButton;

    @FindBy(css = "#center_column>div>p")
    private WebElement errorText;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public RegistrationPage selectTitle(String title) {
        switch (title.toLowerCase()) {
            case "mr":
                titleMr.click();
                break;
            case "mrs":
                titleMrs.click();
                break;
            default:
                System.out.println("Such title doesn't exist");
        }
        return this;
    }

    public RegistrationPage enterCustomerFirstName(String firstName) {
        customerFirstName.clear();
        customerFirstName.sendKeys(firstName);
        return this;
    }

    public RegistrationPage enterCustomerLastName(String lastName) {
        customerLastName.clear();
        customerLastName.sendKeys(lastName);
        return this;
    }

    public RegistrationPage enterCustomerEmail() {
        Random randomGenerator = new Random();
        int randomInt1 = randomGenerator.nextInt(1000);
        int randomInt2 = randomGenerator.nextInt(1000);
        customerEmail.clear();
        customerEmail.sendKeys("user" + randomInt1 + "@gmail" + randomInt2 + ".com");
        return this;
    }

    public RegistrationPage enterCustomerPassword(String password) {
        customerPassword.clear();
        customerPassword.sendKeys(password);
        return this;
    }

    public RegistrationPage enterFirstNameAddress(String fistName) {
        firstNameAddress.clear();
        firstNameAddress.sendKeys(fistName);
        return this;
    }

    public RegistrationPage enterLastNameAddress(String lastName) {
        lastNameAddress.clear();
        lastNameAddress.sendKeys(lastName);
        return this;
    }

    public RegistrationPage enterAddress(String address) {
        this.address.clear();
        this.address.sendKeys(address);
        return this;
    }

    public RegistrationPage enterCity(String city) {
        this.city.clear();
        this.city.sendKeys(city);
        return this;
    }

    public RegistrationPage enterZipCode(String zipCode) {
        this.zipCode.clear();
        this.zipCode.sendKeys(zipCode);
        return this;
    }

    public RegistrationPage enterMobilePhone(String phone) {
        mobilePhone.clear();
        mobilePhone.sendKeys(phone);
        return this;
    }

    public RegistrationPage enterAlias(String alias) {
        this.alias.clear();
        this.alias.sendKeys(alias);
        return this;
    }

    public RegistrationPage clickRegisterButton() {
        registerButton.click();
        return this;
    }

    public String getErrorText() {
        String error = errorText.getText();
        return error;
    }
}
