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
        Map<String, String> MapOfProducts = new HashMap<>();
        MapOfProducts.put("watermelon", "berry");
        MapOfProducts.put("banana", "fruit");
        MapOfProducts.put("cherry", "berry");
        MapOfProducts.put("pineapple", "fruit");
        MapOfProducts.put("melon", "vegetable");
        MapOfProducts.put("cranberry", "berry");
        MapOfProducts.put("apple", "fruit");
        MapOfProducts.put("iris", "flower");
        MapOfProducts.put("potato", "vegetable");
        MapOfProducts.put("carrot", "vegetable");

        String[] keys = MapOfProducts.keySet().toArray(new String[MapOfProducts.size()]);

        for (String key : keys) {
            System.out.println(key + " - " + MapOfProducts.get(key));
        }
    }
}