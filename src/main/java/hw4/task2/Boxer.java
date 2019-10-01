package hw4.task2;

/*
Implement the method fight() depending on weight, strength and age of the boxer:
You should write dependency by yourself. The method should return true or false if our boxer won or lost.
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
    }

    public static void main(String[] args) {

    }
}
1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
*/
public class Boxer {
    private int age;
    private int weight;
    private int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public int getStrength() {
        return strength;
    }
    //For higher parameter value boxer gets the point
    //At the end who get the highest point wins the fight
    public boolean fight(Boxer anotherBoxer) {
        int ourBoxerPoints = 0;
        int anotherBoxerPoints = 0;
        //Comparing age parameter of boxers
        if (this.age > anotherBoxer.age) {
            ourBoxerPoints++;
        } else if (this.age < anotherBoxer.age) {
            System.out.println("No one got points for age parameter");
        } else {
            anotherBoxerPoints++;
        }
        //Comparing weight parameter of boxers
        if (this.weight > anotherBoxer.weight) {
            ourBoxerPoints++;
        } else if (this.weight == anotherBoxer.weight) {
            System.out.println("No one got points for weight parameter");
        } else {
            anotherBoxerPoints++;
        }
        //Comparing strength parameter of boxers
        if (this.strength > anotherBoxer.strength) {
            ourBoxerPoints++;
        } else if (this.strength == anotherBoxer.strength) {
            System.out.println("No one got points for strength parameter");
        } else {
            anotherBoxerPoints++;
        }
        if (ourBoxerPoints >= anotherBoxerPoints) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(100, 100, 100);
        Boxer anotherBoxer = new Boxer(100, 100, 100);
        Boolean whoWon = ourBoxer.fight(anotherBoxer);
        System.out.println(whoWon);

    }
}