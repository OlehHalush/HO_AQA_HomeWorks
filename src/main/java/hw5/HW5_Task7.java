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
        Map<String, String> mapOfProducts = new HashMap<>();
        mapOfProducts.put("watermelon", "berry");
        mapOfProducts.put("banana", "fruit");
        mapOfProducts.put("cherry", "berry");
        mapOfProducts.put("pineapple", "fruit");
        mapOfProducts.put("melon", "vegetable");
        mapOfProducts.put("cranberry", "berry");
        mapOfProducts.put("apple", "fruit");
        mapOfProducts.put("iris", "flower");
        mapOfProducts.put("potato", "vegetable");
        mapOfProducts.put("carrot", "vegetable");

        String[] keys = mapOfProducts.keySet().toArray(new String[mapOfProducts.size()]);

        for (String key : keys) {
            System.out.println(key + " - " + mapOfProducts.get(key));
        }
    }
}