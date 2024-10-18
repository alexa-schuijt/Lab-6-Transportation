import java.util.Locale;
import java.util.Scanner;

public class driver {
    // method to verify that is the one they want and obtain number of passengers
    public static int verifyAndPassengers(String mode, String type) {
        Scanner input = new Scanner(System.in);
        System.out.printf("%n%s%s%s", "You want to use a ", mode, "? (Y or N) ");
        // user input to make sure they want to use that mode
        String answer = input.nextLine().toLowerCase();
        if (answer.equals("y")) {
            // obtains number of passengers and returns it
            System.out.print("How many passengers? ");
            int passengers = input.nextInt();
            return passengers;
        } else {
            // if not y, makes them repeat the process of picking a mode of water transportation
            if(type.equals("water")){
                waterChoice();
            }
            if(type.equals("air")){
                airChoice();
            }
            return 0;
        }
    }

    // method that uses multiple arguments to find out number of vehicles needed, as well as the total cost
    public static void costAndNumber(String mode, int passengers, int maxCapacity, String purchaseMethod, float cost) {
        // math calculation that finds out number of vehicles needed to transport number of passengers
        if (passengers == 0){
            System.exit(0);
        }
        float ratio = (float) passengers / maxCapacity;
        int numberNeeded = (int) Math.ceil(ratio);

        System.out.printf("%s%s%s%d%n", "The number of ", mode, "s you will need is ", numberNeeded);
        // if purchase method is ticket, multiplies cost by passengers
        if (purchaseMethod.equals("ticket")) {
            float totalCost = cost * passengers;
            System.out.printf("%s%.2f%n", "The total cost is $", totalCost);
        }
        // if purchase method is rental, multiplies cost by number of rentals needed
        if (purchaseMethod.equals("rental")) {
            float totalCost = cost * numberNeeded;
            System.out.printf("%s%.2f%n", "The total cost is $", totalCost);
        }
    }

    // if user picks water
    public static void waterChoice() {
        Scanner input = new Scanner(System.in);
        // header
        System.out.printf("%-20s%20s%20s%20s%20s%n", "Mode", "Cost", "Purchase Method", "Average Speed (mph)",
                "Max Capacity");
        // makes all 3 objects
        boat boatObject = new boat();
        submarine submarineObject = new submarine();
        ship shipObject = new ship();
        // displays all of them in a table
        System.out.printf("%s%s%s", boatObject, submarineObject, shipObject);

        System.out.printf("%n%s", "Which mode would you like to use? ");
        String mode = input.nextLine().toLowerCase();

        String type = "water";

        // depending on what mode the user inputs, uses functions to verify, get number of passengers, get cost,
        // and get number of vehicles needed. Ends with getting travel instructions.
        if (mode.equals("ship")) {
            int passengers = verifyAndPassengers(mode, type);
            costAndNumber(mode, passengers, shipObject.getNumPassengers(), shipObject.getPurchaseMethod(),
                    shipObject.getCost());
            System.out.print(shipObject.getInstructions());
        }
        if (mode.equals("boat")) {
            int passengers = verifyAndPassengers(mode, type);
            costAndNumber(mode, passengers, boatObject.getNumPassengers(), boatObject.getPurchaseMethod(),
                    boatObject.getCost());
            System.out.print(boatObject.getInstructions());
        }
        if (mode.equals("submarine")) {
            int passengers = verifyAndPassengers(mode, type);
            costAndNumber(mode, passengers, submarineObject.getNumPassengers(), submarineObject.getPurchaseMethod(),
                    submarineObject.getCost());
            System.out.print(submarineObject.getInstructions());
        }
        // if user inputs incorrect mode, exits program
        else {
            System.exit(0);
        }

    }

    public static void airChoice(){
        Scanner input = new Scanner(System.in);
        // header
        System.out.printf("%-20s%20s%20s%20s%20s%20s%n", "Mode", "Cost", "Purchase Method", "Average Speed (mph)",
                "Max Capacity", "Height Max");
        airplane airplaneObject = new airplane();
        helicopter helicopterObject = new helicopter();
        System.out.printf("%s%s", airplaneObject, helicopterObject);

        System.out.printf("%n%s", "Which mode would you like to use? ");
        String mode = input.nextLine().toLowerCase();

        String type = "air";
        if(mode.equals("airplane")){
            int passengers = verifyAndPassengers(mode, type);
            costAndNumber(mode, passengers, airplaneObject.getNumPassengers(), airplaneObject.getPurchaseMethod(),
                    airplaneObject.getCost());
            System.out.print(airplaneObject.getInstructions());
        }
        if(mode.equals("helicopter")){
            int passengers = verifyAndPassengers(mode, type);
            costAndNumber(mode, passengers, helicopterObject.getNumPassengers(), helicopterObject.getPurchaseMethod(),
                    helicopterObject.getCost());
            System.out.print(helicopterObject.getInstructions());
        }
        else{
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Wilmington Travel Center!");
        Scanner input = new Scanner(System.in);
        System.out.print("What type of transportation would you like to use? ");
        String type = input.nextLine().toLowerCase();

        if (type.equals("water")) {
            waterChoice();
        }
        if (type.equals("air")){
            airChoice();
        }

    }
}