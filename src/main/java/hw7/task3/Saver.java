package hw7.task3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.Set;

/*
Написать код, который сериализирует и десериализирует в/из файла все значения полей класса, которые отмечены аннотацией @Save.
*/

public class Saver {
    public static void save(Person person, String path) {
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        try {
            for (Field field : Person.class.getDeclaredFields()) {
                if (field.isAnnotationPresent(Save.class)) {
                    field.setAccessible(true);
                    writeFieldToFile(field.getName(), field.get(person).toString(), file);
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    private static void writeFieldToFile(String fieldName, String fieldValue, File file) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(fieldName + " = " + fieldValue + "\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void read(String path) {
        try (InputStream input = new FileInputStream(path)) {
            Properties prop = new Properties();
            prop.load(input);
            Set<Object> keys = prop.keySet();
            for (Object key : keys) {
                System.out.println(key + " = " + prop.getProperty((String) key));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Person myPerson = new Person("Tony", "Hopkins", "Syhiv distict");
        save(myPerson, "C:\\Users\\Oleh Halush\\Desktop\\myTextFile.txt");
        read("C:\\Users\\Oleh Halush\\Desktop\\myTextFile.txt");
    }
}