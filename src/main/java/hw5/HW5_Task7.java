package hw5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

Print the content of the map, each pair from a new line.
Example:
watermelon - berry;
cherry - berry;
...
*/
public class HW5_Task7 {
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

        for (String key : keys) {
            System.out.println(key + " - " + myMap.get(key));
        }
    }
}