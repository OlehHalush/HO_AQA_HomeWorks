package hw8;

/*
1) Woman from a header
Can't write the selector as it's an image
2) "Sale 70% off all products" inscription
Can't write the selector as it's an image
3) "Get savings now" inscription
Can't write the selector as it's an image
4) "Call us now" inscription
$$("span.shop-phone")
$x("//span[@class='shop-phone']")
5) Phone number:
$$("span.shop-phone strong")
$x("//span[@class='shop-phone']/strong")
6) "Contact us" button
$$("a[title='Contact Us']")
$x("//a[@title='Contact Us']")
7) "Sign in" button
$$(".login")
$x("//a[@class='login']")
8) Logo
$$(".logo.img-responsive")
$x("//div[@id='header_logo']/a[@title='My Store']/img[@alt='My Store']")
9) Search field
$$("#search_query_top")
$x("//input[@id='search_query_top']")
10) Search button
$$("button[name='submit_search']")
$x("//button[@name='submit_search']")
11) Cart
$$("div.shopping_cart>a[title='View my shopping cart']")
$x("//div[@class='shopping_cart']/a[@title='View my shopping cart']")
12) Women
$$("a[title='Women']")
$x("//a[@title='Women']")
13) Dresses
$$("#block_top_menu>ul>li>a[title='Dresses']")
$x("//div[@id='block_top_menu']/ul/li/a[@title='Dresses']")
14) T-shirts
$$("#block_top_menu>ul>li>a[title='T-shirts']")
$x("//div[@id='block_top_menu']/ul/li/a[@title='T-shirts']")
15) "Home" icon
$$("a[title='Return to Home']")
$x("//a[@title='Return to Home']")
16) "Authentication" bread crumb
No css selector for selecting by text
$x("//span[normalize-space()='Authentication']")
17) "Authentication" header
No css selector for selecting by text
$x("//h1[text()='Authentication']")
18) "Create an account" section heading
No css selector for selecting by text
$x("//h3[text()='Create an account']")
19) Account creation tool tip
$$("#create-account_form>div>p")
$x("//form[@id='create-account_form']//p")
20) "Email Address" title in account creation section
$$("label[for='email_create']")
$x("//label[@for='email_create']")
21) Email input field in account creation section
$$("#email_create")
$x("//input[@id='email_create']")
22) "Create an account" button
$$("#SubmitCreate")
$x("//button[@id='SubmitCreate']")
23) "Already registered?" section header
$$("#login_form .page-subheading")
$x("//form[@id='login_form']/h3[@class='page-subheading']")
24) "Email Address" title in login section
$$("#login_form label[for='email']")
$x("//form[@id='login_form']//label[@for='email']")
25) Email input field in login section
$$("input#email")
$x("//input[@id='email']")
26) "Password" title in login section
$$("label[for='passwd']")
$x("//label[@for='passwd']")
27) Password input field in login section
$$("#passwd")
$x("//input[@id='passwd']")
28) "Forgot your passowrd?" link
$$("a[title='Recover your forgotten password']")
$x("//a[@title='Recover your forgotten password']")
29) "Sign in" button on login form
$$("#SubmitLogin")
$x("//button[@id='SubmitLogin']")
*/

public class HW8 {
    public static void main(String[] args) {
    }
}