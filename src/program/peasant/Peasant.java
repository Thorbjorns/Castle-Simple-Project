package program.peasant;

public class Peasant {
    String name;
    String vegetable;

    public Peasant(String name, String vegetables) {
        this.name = name;
        this.vegetable = vegetables;
    }

    public String getName() {
        return name;
    }

    public String getVegetable() {
        return vegetable;
    }

    public void peasantInformation(){
        System.out.println("Name of peasant: " + name);
        System.out.println(name + " is harvesting: " + vegetable);
    }
}
