import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

import java.util.*;
import java.util.stream.Collectors;

public class PractiseZone {
    public static void main(String[] args){

//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("Zain");
//        arrayList.add("Ahmad");
//        arrayList.add("Hamza");
//        arrayList.add("Fatima");
//        List<String> list= new ArrayList<String>();
//        list = arrayList.stream().map(item->item+" Amjad").collect(Collectors.toList());
//        for(String name : list){
//            System.out.println(name);
//        }
//        System.out.println("\n");
//        list = arrayList.stream().filter(item->item.startsWith("Z")).collect(Collectors.toList());
//        for(String name : list){
//            System.out.println(name);
//        }
//        System.out.println("\n");
//        list = arrayList.stream().map(String::toLowerCase).collect(Collectors.toList());
//        for(String name : list){
//            System.out.println(name);
//        }
//        System.out.println("\n");
//
//        list = list.stream().map(item->item+" Amjad").collect(Collectors.toList());
//        for(String name : list){
//            System.out.println(name);
//        }

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("1","Zain");
        hashMap.put("2","Oain");
        hashMap.put("3","Pain");
        hashMap.put("4","Lain");
        hashMap.put("5","Main");
        List<String> arrayList = new ArrayList<String>();
        for (Map.Entry<String,String> iterator : hashMap.entrySet()){
            arrayList.add(iterator.getValue());
        }
       arrayList = arrayList.stream().map(String::toLowerCase).collect(Collectors.toList());
       System.out.println(arrayList);

       arrayList.forEach(System.out::println);

      Optional<String> len =  arrayList.stream().findAny();
      System.out.println(len);

      boolean b = arrayList.stream().anyMatch(item->item.equals("zain"));
      System.out.println(b);

      List<Integer> numbers = Arrays.asList(1,2,3,4);
         int sum = numbers.stream().reduce(0,(a,c)->a-c);
        System.out.println(sum);
    }
}
