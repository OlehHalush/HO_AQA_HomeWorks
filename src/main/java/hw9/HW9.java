package hw9;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/*
Открыть главную страницу automationpractice.com
Открыть форму регистрации нового клиента (Sign in )
В секции Create an account ввести корректный емейл
Нажать Create an account
На форме регистрации заполнить ВСЕ ОБЯЗАТЕЛЬНЫЕ поля , КРОМЕ
выпадающих списков
Нажать Register
Проверить что сообщение валидации содержит текст ,
например “There are 3 errors
*/

public class HW9 {
    private WebDriver driver;

    public HW9(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignInButton() {
        WebElement signInButton = driver.findElement(By.className("login"));
        signInButton.click();
    }

    public void enterEmailAddress() {
        WebElement emailField = driver.findElement(By.id("email_create"));
        emailField.clear();
        emailField.sendKeys("asd@qwerty.com");
    }

    public void clickCreateAccountButton() {
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
    }

    public void clickGenderRadioButton() {
        WebElement genderRadioButton = driver.findElement(By.id("id_gender1"));
        genderRadioButton.click();
    }

    public void enterFirstName() {
        WebElement firstNameInfo = driver.findElement(By.id("customer_firstname"));
        firstNameInfo.clear();
        firstNameInfo.sendKeys("Oleh");
    }

    public void enterLastName() {
        WebElement lastNameInfo = driver.findElement(By.id("customer_lastname"));
        lastNameInfo.clear();
        lastNameInfo.sendKeys("Halush");
    }

    public void enterEmailInPersonalInfo() {
        WebElement emailInfo = driver.findElement(By.id("email"));
        emailInfo.clear();
        emailInfo.sendKeys("asd@qwerty.com");
    }

    public void enterPassword() {
        WebElement passwordInfo = driver.findElement(By.id("passwd"));
        passwordInfo.clear();
        passwordInfo.sendKeys("123123");
    }

    public void enterFirstNameAddress() {
        WebElement firstNameAddress = driver.findElement(By.cssSelector("input#firstname"));
        firstNameAddress.clear();
        firstNameAddress.sendKeys("Oleh");
    }

    public void enterLastNameAddress() {
        WebElement lastNameAddress = driver.findElement(By.cssSelector("input#lastname"));
        lastNameAddress.clear();
        lastNameAddress.sendKeys("Halush");
    }

    public void enterAddress() {
        WebElement address = driver.findElement(By.id("address1"));
        address.clear();
        address.sendKeys("Some street 5/213");
    }

    public void enterCity() {
        WebElement city = driver.findElement(By.id("city"));
        city.clear();
        city.sendKeys("Some city");
    }

    public void enterZIPCode() {
        WebElement zip = driver.findElement(By.id("postcode"));
        zip.clear();
        zip.sendKeys("12345");
    }

    public void enterMobilePhone() {
        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.clear();
        mobilePhone.sendKeys("123123123");
    }

    public void enterAlias() {
        WebElement alias = driver.findElement(By.id("alias"));
        alias.clear();
        alias.sendKeys("My address");
    }

    public void clickRegisterButton() {
        WebElement registerButton = driver.findElement(By.id("submitAccount"));
        registerButton.click();
    }

    public String getErrorText() {
        String errorText = driver.findElement(By.cssSelector("#center_column>div>p")).getText();
        return errorText;
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HW9 myObject = new HW9(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com");

        myObject.clickSignInButton();
        myObject.enterEmailAddress();
        myObject.clickCreateAccountButton();
        myObject.clickGenderRadioButton();
        myObject.enterFirstName();
        myObject.enterLastName();
        myObject.enterEmailInPersonalInfo();
        myObject.enterPassword();
        myObject.enterFirstNameAddress();
        myObject.enterLastNameAddress();
        myObject.enterAddress();
        myObject.enterCity();
        myObject.enterZIPCode();
        myObject.enterMobilePhone();
        myObject.enterAlias();
        myObject.clickRegisterButton();

        Assert.assertEquals("There is 1 error", myObject.getErrorText());
        driver.quit();
    }
}