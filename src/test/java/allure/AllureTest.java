package allure;

import io.qameta.allure.Description;
import org.junit.Test;

public class AllureTest {

    @Test
    @Description("My first allure test")
    public void allureTest(){
        System.out.println("Allure test has been run successfully");
    }
}
