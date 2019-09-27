package HW4;

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
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        int ourBoxerPoints = 0;
        int anotherBoxerPoints = 0;

        if (this.age > anotherBoxer.age || this.age == anotherBoxer.age) {
            ourBoxerPoints += 1;
        } else {
            anotherBoxerPoints += 1;
        }
        if (this.weight > anotherBoxer.weight || this.weight == anotherBoxer.weight) {
            ourBoxerPoints += 1;
        } else {
            anotherBoxerPoints += 1;
        }
        if (this.strength > anotherBoxer.strength || this.strength == anotherBoxer.strength) {
            ourBoxerPoints += 1;
        } else {
            anotherBoxerPoints += 1;
        }
        if (ourBoxerPoints > anotherBoxerPoints) {
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