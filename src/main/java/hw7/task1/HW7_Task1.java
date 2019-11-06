package hw7.task1;

import java.lang.reflect.Method;

/*
Создать аннотацию, которая принимает параметры для метода. Написать код, который вызовет метод, помеченный этой аннотацией, и передаст параметры аннотации в вызываемый метод.
@Test(a=2, b=5)
public void test(int a, int b) {...}
*/

public class HW7_Task1 {
    public static void main(String[] args) {
        HW7_Task1 myClass = new HW7_Task1();
        Method[] methods = HW7_Task1.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                Test myAnnotation = method.getAnnotation(Test.class);
                myClass.test(myAnnotation.a(), myAnnotation.b());
            }
        }
    }

    @Test(a = 2, b = 5)
    public void test(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }
}