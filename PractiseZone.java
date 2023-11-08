import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PractiseZone {
    public static void main(String[] args){

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Zain");
        arrayList.add("Ahmad");
        arrayList.add("Hamza");
        arrayList.add("Fatima");
        List<String> list= new ArrayList<String>();
        list = arrayList.stream().map(item->item+" Amjad").collect(Collectors.toList());
        for(String name : list){
            System.out.println(name);
        }
        System.out.println("\n");
        list = arrayList.stream().filter(item->item.startsWith("Z")).collect(Collectors.toList());
        for(String name : list){
            System.out.println(name);
        }
        System.out.println("\n");
        list = arrayList.stream().map(String::toLowerCase).collect(Collectors.toList());
        for(String name : list){
            System.out.println(name);
        }
        System.out.println("\n");

        list = list.stream().map(item->item+" Amjad").collect(Collectors.toList());
        for(String name : list){
            System.out.println(name);
        }
    }
}
