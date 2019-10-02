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

        for (Map.Entry<String, String> set : mapOfProducts.entrySet()) {
            if (set.getValue() == "vegetable") {
                System.out.println(set.getKey() + " - " + set.getValue());
            }
        }
    }
}