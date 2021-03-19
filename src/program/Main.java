package program;

import program.army.Army;
import program.peasant.Village;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Army army = new Army();
        Village village = new Village();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your castle name");
        String castleName = scanner.next();
        boolean running = true;
        while (running){
            System.out.println("Choose an option in your castle: " + castleName);
            System.out.println("1: Show informations about your soldiers:");
            System.out.println("2: Add a soldier:");
            System.out.println("3: Display weapons in armory:");
            System.out.println("4: Show informations about peasants:");
            System.out.println("5: Add peasant:");
            System.out.println("6: Show kinds of vegetables:");
            System.out.println("7: Force peasants to pay taxes:");
            System.out.println("8: Show tax payment status:");
            System.out.println("9: Quit program:");

            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> army.displaySoldier();
                case 2 -> army.addSoldier();
                case 3 -> army.showWeapons();
                case 4 -> village.showPeasant();
                case 5 -> village.addPeasant();
                case 6 -> village.showVegetable();
                case 7 -> village.forceToPay();
                case 8 -> village.showTaxPayment();
                case 9 -> running = false;
            }
        }
    }
}
