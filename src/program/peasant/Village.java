package program.peasant;

import java.util.*;

public class Village {
    Scanner scanner = new Scanner(System.in);

    private boolean taxes = false;
    String taxesString = taxes ? "Yes":"No";

    List<Peasant> peasants = new ArrayList<>();
    Set<String> veggies = new HashSet<>();

    public void addPeasant(){
        System.out.println("Input name of a peasant: ");
        String name = scanner.nextLine();
        System.out.println("What kind of vegetable is " + name + " harvesting?");
        String vegetable = scanner.nextLine();
        Peasant peasant = new Peasant(name,vegetable);
        peasants.add(peasant);
        veggies.add(vegetable);
    }

    public void showVegetable(){
        System.out.println("Peasants are harvesting this kind of vegetables: ");
        for (String veggie:veggies) {
            System.out.println(veggie);
        }
    }

    public void forceToPay(){
        taxes = true;
        System.out.println("You forced peasants to pay!");
    }

    public void showTaxPayment(){
        if (taxes){
            System.out.println("Peasants are paying taxes, kingdom earns a lot!");
        }else {
            System.out.println("Peasants don't pay taxes, kingdom becomes poor...");
        }
    }

    public void showPeasant(){
        for (Peasant peasant:peasants) {
            peasant.peasantInformation();
        }
    }
}
