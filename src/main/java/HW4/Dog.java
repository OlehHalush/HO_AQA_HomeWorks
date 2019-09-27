package HW4;

/*
Create a class Dog.
The dog should have a name and an age (private).
Create getters and setter for all the fields.
1) When you will be creating setters - keep in mind that fields shouldn't be empty and age can't be less of equals to zero.
*/
public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            this.name = "Invalid name";
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            this.age = 1;
        } else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Pitbul", 33);
        myDog.setAge(2);
        myDog.setName("Chelsie");
        System.out.println("Name: " + myDog.getName() + ", age: " + myDog.getAge());
    }
}
