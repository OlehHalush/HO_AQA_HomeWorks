package HW12_TestNG;

import org.testng.annotations.Test;

/*
1. Create a new Maven project;
2. Add TestNG dependency and Selenium Web Driver;
3. Add several test.feature classes and 4-5 tests to each class.
4. Write @BeforeTest method where you should create your instance of a
WebDriver.
5. Write @AfterTest method where you should close your browser.
6. Add a testng.xml configuration file.
7. Configure the test.feature suite to run all tests from the first class and only two from the second.
8. Create a @DataProvider method to generate some data for your tests.
9. Add your data provider to any test.feature you wish.
*/

public class TestClass3 {
    @Test
    public void class3Test1() {
        System.out.println("class3Test1");
    }

    @Test
    public void class3Test2() {
        System.out.println("class3Test2");
    }

    @Test
    public void class3Test3() {
        System.out.println("class3Test3");
    }

    @Test
    public void class3Test4() {
        System.out.println("class3Test4");
    }

    @Test
    public void class3Test5() {
        System.out.println("class3Test5");
    }
}