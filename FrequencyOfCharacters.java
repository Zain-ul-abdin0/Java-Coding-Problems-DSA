import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args){
        String str = "Hello World";
        Map<Character,Integer> frequency = new HashMap<>();
        for(char freq : str.toCharArray()){
            frequency.put(freq, frequency.getOrDefault(freq,0)+1);
        }
        System.out.println(frequency);
    }
}
