package HW12_TestNG;

import org.testng.annotations.Test;

/*
1. Create a new Maven project;
2. Add TestNG dependency and Selenium Web Driver;
3. Add several test classes and 4-5 tests to each class.
4. Write @BeforeTest method where you should create your instance of a
WebDriver.
5. Write @AfterTest method where you should close your browser.
6. Add a testng.xml configuration file.
7. Configure the test suite to run all tests from the first class and only two from the second.
8. Create a @DataProvider method to generate some data for your tests.
9. Add your data provider to any test you wish.
*/

public class TestClass2 {
    @Test
    public void class2Test1() {
        System.out.println("class2Test1");
    }

    @Test
    public void class2Test2() {
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