import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class  RemovDuplicates {
   public static void main(String[] args){
       ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,3,3,3,3,3,3));
       Set<Integer> set = new HashSet<>(numbers);
       System.out.println(set);
   }
}
