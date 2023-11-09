class Country{
    static String name;
    private Integer population;

    public Country() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Country.name = name;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

}