public class StringContainsVowels {
    public static void main(String[] args){
        System.out.println(stringContainsVowels("Hello")); // true
        System.out.println(stringContainsVowels("TV")); //
    }
    public static boolean stringContainsVowels(String str){
        return  str.toLowerCase().matches(".*[aeiou].*");
    }
}
