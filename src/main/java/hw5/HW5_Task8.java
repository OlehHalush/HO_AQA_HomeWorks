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

        for (Map.Entry<String, String> set : MapOfProducts.entrySet()) {
            if (set.getValue() == "vegetable") {
                System.out.println(set.getKey() + " - " + set.getValue());
            }
        }
    }
}