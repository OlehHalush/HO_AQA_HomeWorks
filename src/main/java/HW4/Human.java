package HW4;

/*
Create a class ""Human"". A human should have the following attributes:
weight, age, first name, last name, height.
1) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
2) Add to the class a constructor with parameters which initialize all the fields.
*/
public class Human {
    public int weight;
    public int age;
    public String firstName;
    public String lastName;
    public int height;

    public Human(int weight, int age, String firstName, String lastName, int height) {
        this.weight = weight;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public static void main(String[] args) {
        Human myHuman = new Human(74, 30, "Antony", "Hopkins", 185);
        System.out.println("Weight: " + myHuman.weight + ", age: " + myHuman.age + ", first name: " + myHuman.firstName + ", last name: " + myHuman.lastName + ", height: " + myHuman.height);
    }
}