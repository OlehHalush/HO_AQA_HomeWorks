package hw4.task1;

/*
Create a class ""Human"". A human should have the following attributes:
weight, age, first name, last name, height.
1) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
2) Add to the class a constructor with parameters which initialize all the fields.
*/
public class Human {
    private int weight;
    private int age;
    private String firstName;
    private String lastName;
    private int height;

    public Human(int weight, int age, String firstName, String lastName, int height) {
        this.weight = weight;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "weight = " + weight + ", age = " + age + ", firstName = " + firstName + ", lastName = " + lastName + ", height = " + height;
    }

    public static void main(String[] args) {
        Human myHuman = new Human(74, 30, "Antony", "Hopkins", 185);
        System.out.println(myHuman);
    }
}