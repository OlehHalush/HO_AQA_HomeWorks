package hw9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/*
1. Открыть главную страницу automationpractice.com
2. В поле поиска ввести “Blouse” и выполнить поиск
3. Переключится на режим просмотра ‘List”
4. Добавить товар в корзину
5. В секции Summary увеличить количество товаров на 1
6. Проверить что значения Total для товара , Total products, Total
shipping , Total всех товаров , Tax и TOTAL общий отображается
корректно
7. Удалить товар из корзины
8. Проверить что корзина пустая
*/

public class HW9_Task2 {
    WebDriver driver;

    public HW9_Task2(WebDriver driver) {
        this.driver = driver;
    }

    public void enterIntoSearchField(String searchText) {
        WebElement searchField = driver.findElement(By.id("search_query_top"));
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.cssSelector("button[name='submit_search']"));
        searchButton.click();
    }

    public void switchToListView() {
        WebElement listView = (new WebDriverWait(driver, 5)).until(ExpectedConditions.elementToBeClickable(By.id("list")));
        // For some reason one one click is not working
        listView.click();
        listView.click();
    }

    public void addToCart() {
        WebElement addToCartButton = (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Add to cart']")));
        addToCartButton.click();
    }

    public void clickProceedToCheckoutButton() {
        WebElement proceedToCheckoutButton = (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Proceed to checkout']")));
        proceedToCheckoutButton.click();
    }

    public void increaseAmountOfProduct() {
        WebElement addAmountButton = (new WebDriverWait(driver, 5)).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[title='Add']")));
        addAmountButton.click();

    }

    public void checkTotalForProduct(String expectedAmount) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.id("total_product_price_2_7_0"), expectedAmount));
        if (textToBePresent == true) {
            String actualAmount = driver.findElement(By.id("total_product_price_2_7_0")).getText();
            Assert.assertEquals(expectedAmount, actualAmount);
        } else {
            System.out.println(expectedAmount + " is not displayed in Total for product");
        }
    }

    public void checkTotalForProducts(String expectedAmount) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.id("total_product"), expectedAmount));
        if (textToBePresent == true) {
            String actualAmount = driver.findElement(By.id("total_product")).getText();
            Assert.assertEquals(expectedAmount, actualAmount);
        } else {
            System.out.println(expectedAmount + " is not displayed in Total products");
        }
    }

    public void checkTotalForShipping(String expectedAmount) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.id("total_shipping"), expectedAmount));
        if (textToBePresent == true) {
            String actualAmount = driver.findElement(By.id("total_shipping")).getText();
            Assert.assertEquals(expectedAmount, actualAmount);
        } else {
            System.out.println(expectedAmount + " is not displayed in Total shipping");
        }
    }

    public void checkTotalWithoutTax(String expectedAmount) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.id("total_price_without_tax"), expectedAmount));
        if (textToBePresent == true) {
            String actualAmount = driver.findElement(By.id("total_price_without_tax")).getText();
            Assert.assertEquals(expectedAmount, actualAmount);
        } else {
            System.out.println(expectedAmount + " is not displayed in Total without tax");
        }
    }

    public void checkTotalTax(String expectedAmount) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.id("total_tax"), expectedAmount));
        if (textToBePresent == true) {
            String actualAmount = driver.findElement(By.id("total_tax")).getText();
            Assert.assertEquals(expectedAmount, actualAmount);
        } else {
            System.out.println(expectedAmount + " is not displayed in Total Tax");
        }
    }

    public void checkGeneralTotal(String expectedAmount) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.id("total_price"), expectedAmount));
        if (textToBePresent == true) {
            String actualAmount = driver.findElement(By.id("total_price")).getText();
            Assert.assertEquals(expectedAmount, actualAmount);
        } else {
            System.out.println(expectedAmount + " is not displayed in general Total");
        }
    }

    public void clearCart() {
        WebElement deleteButton = driver.findElement(By.cssSelector("a[title='Delete']"));
        deleteButton.click();
    }

    public void checkCartIsEmpty(String expectedText) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.cssSelector(".ajax_cart_no_product"), expectedText));
        if (textToBePresent == true) {
            String actualText = driver.findElement(By.cssSelector(".ajax_cart_no_product")).getText();
            Assert.assertEquals(expectedText, actualText);
        } else {
            System.out.println(expectedText + "Cart is not empty");
        }
    }

    public void checkEmptyCartMessage(String expectedText) {
        Boolean textToBePresent = (new WebDriverWait(driver, 5)).until(ExpectedConditions.textToBe(By.cssSelector(".alert.alert-warning"), expectedText));
        if (textToBePresent == true) {
            String actualText = driver.findElement(By.cssSelector(".alert.alert-warning")).getText();
            Assert.assertEquals(expectedText, actualText);
        } else {
            System.out.println(expectedText + "Cart is not empty");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HW9_Task2 HW9_Task2 = new HW9_Task2(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com");

        HW9_Task2.enterIntoSearchField("Blouse");
        HW9_Task2.clickSearchButton();
        HW9_Task2.switchToListView();
        HW9_Task2.addToCart();
        HW9_Task2.clickProceedToCheckoutButton();
        HW9_Task2.increaseAmountOfProduct();
        HW9_Task2.checkTotalForProduct("$54.00");
        HW9_Task2.checkTotalForProducts("$54.00");
        HW9_Task2.checkTotalForShipping("$2.00");
        HW9_Task2.checkTotalWithoutTax("$56.00");
        HW9_Task2.checkTotalTax("$0.00");
        HW9_Task2.checkGeneralTotal("$56.00");
        HW9_Task2.clearCart();
        HW9_Task2.checkCartIsEmpty("(empty)");
        HW9_Task2.checkEmptyCartMessage("Your shopping cart is empty.");
        driver.quit();
    }
}