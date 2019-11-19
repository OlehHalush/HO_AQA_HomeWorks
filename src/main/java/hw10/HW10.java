package hw10;

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

public class HW10 {
    WebDriver driver;

    public HW10(WebDriver driver) {
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

    public void checkAmountOfProducts(String value) {
        Boolean asd = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.attributeToBe(By.cssSelector("input[name='quantity_2_7_0_0_hidden']"), "value", value));
    }

    public String getTotalForProduct() {
        String actualAmount = driver.findElement(By.id("total_product_price_2_7_0")).getText();
        return actualAmount;
    }

    public String getTotalForProducts() {
        String actualAmount = driver.findElement(By.id("total_product")).getText();
        return actualAmount;
    }

    public String getTotalForShipping() {
        String actualAmount = driver.findElement(By.id("total_shipping")).getText();
        return actualAmount;
    }

    public String getTotalWithoutTax() {
        String actualAmount = driver.findElement(By.id("total_price_without_tax")).getText();
        return actualAmount;
    }

    public String getTotalTax() {
        String actualAmount = driver.findElement(By.id("total_tax")).getText();
        return actualAmount;
    }

    public String getGeneralTotal() {
        String actualAmount = driver.findElement(By.id("total_price")).getText();
        return actualAmount;
    }

    public void clearCart() {
        WebElement deleteButton = driver.findElement(By.cssSelector("a[title='Delete']"));
        deleteButton.click();
    }

    public String getTextFromEmptyCartLabel() {
        new WebDriverWait(driver, 5).until(ExpectedConditions.invisibilityOfElementWithText(By.cssSelector(".shopping_cart > a > span.ajax_cart_product_txt_s.unvisible"), "Products"));
        String actualAmount = driver.findElement(By.cssSelector(".ajax_cart_no_product")).getText();
        return actualAmount;
    }

    public String getTextFromEmptyCart() {
        String actualAmount = driver.findElement(By.cssSelector(".alert.alert-warning")).getText();
        return actualAmount;
    }

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src//main//resources//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HW10 HW10Object = new HW10(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("http://automationpractice.com");

        HW10Object.enterIntoSearchField("Blouse");
        HW10Object.clickSearchButton();
        HW10Object.switchToListView();
        HW10Object.addToCart();
        HW10Object.clickProceedToCheckoutButton();
        HW10Object.increaseAmountOfProduct();
        HW10Object.checkAmountOfProducts("2");

        Assert.assertEquals("$54.00", HW10Object.getTotalForProduct());
        Assert.assertEquals("$54.00", HW10Object.getTotalForProducts());
        Assert.assertEquals("$2.00", HW10Object.getTotalForShipping());
        Assert.assertEquals("$56.00", HW10Object.getTotalWithoutTax());
        Assert.assertEquals("$0.00", HW10Object.getTotalTax());
        Assert.assertEquals("$56.00", HW10Object.getGeneralTotal());

        HW10Object.clearCart();

        Assert.assertEquals("(empty)", HW10Object.getTextFromEmptyCartLabel());
        Assert.assertEquals("Your shopping cart is empty.", HW10Object.getTextFromEmptyCart());

        driver.quit();
    }
}