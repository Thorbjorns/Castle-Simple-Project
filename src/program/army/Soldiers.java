package program.army;

public class Soldiers {
private String name;
private String weapon;
private boolean hasArmor;

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public boolean doesHaveArmor() {
        return hasArmor;
    }

    public Soldiers(String name, String weapon, boolean hasArmor) {
        this.name = name;
        this.weapon = weapon;
        this.hasArmor = hasArmor;
    }

    public void showSoldierInfo(){
        System.out.println("Name of a soldier: " + name);
        System.out.println(name + " has a: " + weapon);
        String hasArmorString = hasArmor? "Yes":"No";
        System.out.println(name + " has an armor? " + hasArmorString + "\n");
    }
}
