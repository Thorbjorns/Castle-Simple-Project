package program.army;

import java.util.*;

public class Army {

    Scanner scanner = new Scanner(System.in);
    List<Soldiers> infantry = new ArrayList<>();
    Set<String> armory = new HashSet<>();

public void addSoldier(){
    System.out.println("Insert name: ");
    String name = scanner.next();
    System.out.println("Insert weapon: ");
    String weapon = scanner.next();
    System.out.println("Has an armor? (Y/N): ");
    String hasArmorString = scanner.next();
    boolean hasArmor;
    if (hasArmorString.equals("Y")){
        hasArmor = true;
    }else {
        hasArmor = false;
    }
    Soldiers soldiers = new Soldiers(name,weapon,hasArmor);
    infantry.add(soldiers);
    armory.add(weapon);

}


public void showWeapons(){
    System.out.println("In the armory we have this kind of weapons: ");
    for (String weapon:armory) {
        System.out.println(weapon);
    }

}

public void displaySoldier(){
    for (Soldiers soldiers: infantry) {
        soldiers.showSoldierInfo();
    }

}

}
