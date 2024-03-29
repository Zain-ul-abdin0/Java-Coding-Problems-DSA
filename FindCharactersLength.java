import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindCharactersLength {
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter a string: ");
       String characters = scanner.nextLine();
       char[] charArray = characters.toCharArray();
       HashMap<Character, Integer> hashMap = new HashMap<>();
       for(char character : charArray){
           if(hashMap.containsKey(character)){
           for(Map.Entry<Character,Integer> check : hashMap.entrySet()) {
               if (check.getKey().equals(character)) {
                   hashMap.put(check.getKey(), check.getValue() + 1);
               }
           }
           }else{
               hashMap.put(character,1);
           }
       }
       System.out.println(hashMap);
   }
}
