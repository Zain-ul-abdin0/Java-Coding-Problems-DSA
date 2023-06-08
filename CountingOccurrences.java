import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingOccurrences {

    public static void main(String[] args){
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple"));
        Map<String, Integer> fruitCount = new HashMap<>();
        for (String fruit : fruits){
            System.out.println(fruit); // Output: {apple=3, banana=2, orange=1}

            fruitCount.put(fruit,fruitCount.getOrDefault(fruit,0)+1);
        }
        System.out.println(fruitCount); // Output: {apple=3, banana=2, orange=1}
    }
}



