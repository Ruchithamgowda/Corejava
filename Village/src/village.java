public class village {
    private String name;
    private int population;
    private String district;

    public village(String name, int population, String district) {
        this.name = name;
        this.population = population;
        this.district = district;
    }
    public void displayVillage() {
        System.out.println("Village Name: " + name);
        System.out.println("Population: " + population);
        System.out.println("District: " + district);
        System.out.println("----------------------------");
    }
}