package hw5;

import java.util.HashMap;
import java.util.Map;

/*
Create HashMap<String, String> and add 10 pairs:
 watermelon, berry;
 banana, fruit;
 cherry, berry;
 pineapple, fruit;
 melon, vegetable;
 cranberry, berry;
 apple, fruit;
 iris, flower;
 potato, vegetable;
 carrot, vegetable;
Print only vegetables to the console.
1) Do not use predefined keys to get vegetables. You should use conditions to find vegetables.
2) Map iterator;
3) Map.Entry
4) Foreach
 */
public class HW5_Task8 {
    public static void main(String[] args) {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("watermelon", "berry");
        myMap.put("banana", "fruit");
        myMap.put("cherry", "berry");
        myMap.put("pineapple", "fruit");
        myMap.put("melon", "vegetable");
        myMap.put("cranberry", "berry");
        myMap.put("apple", "fruit");
        myMap.put("iris", "flower");
        myMap.put("potato", "vegetable");
        myMap.put("carrot", "vegetable");

        String[] keys = myMap.keySet().toArray(new String[myMap.size()]);

        for (Map.Entry<String, String> set : myMap.entrySet()) {
            if (set.getValue() == "vegetable") {
                System.out.println(set.getKey() + " - " + set.getValue());
            }
        }
    }
}
