package hw7.task2;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Main mainClassInstance = new Main();
        Container containerClassInstance = new Container();

        Class<?> saverClass = Main.class;
        Class<?> container = Container.class;
        SaveTo pathFromAnnotation = container.getAnnotation(SaveTo.class);
        Method[] methods = saverClass.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Saver.class)) {
                mainClassInstance.save(pathFromAnnotation.path(), containerClassInstance.someString);
            }
        }
    }

    @Saver
    public void save(String path, String text) {
        try {
            Files.write(Paths.get(path), text.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}