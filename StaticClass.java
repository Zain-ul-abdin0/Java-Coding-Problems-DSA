
public class StaticClass {
    public static void main(String [] args){
        Country.name = "Germany";
        Country country = new Country();
        country.setPopulation(20);
        System.out.println(country.getPopulation());
        System.out.println(Country.name);

    }
}
