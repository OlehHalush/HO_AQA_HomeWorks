package hw7.task2;

/*
2. Написать класс TextContainer, который содержит в себе строку. С помощью механизма аннотаций указать
1) в какой файл должен сохраниться текст 2) метод, который выполнит сохранение. Написать класс Saver,
который сохранит поле класса TextContainer в указанный файл.

@SaveTo(path=“c:\\file.txt”)
class Container {
String text = “...”;
@Saver
public void save(..) {...}
}
*/
@SaveTo(path = "C:\\Users\\OlehHalush\\Desktop\\myTextFile.txt")
public class Container {
    String someString = "Some random string";
}