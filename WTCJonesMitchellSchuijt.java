// CSC331 - 001
// Rachel Jones, Madison Mitchell, Alexa Schuijt
// Lab 6 - Make 15 transportation classes and a driver file using polymorphism and inheritance

import java.util.Scanner;

public class WTCJonesMitchellSchuijt {
    // method to verify that is the mode they want and obtain number of passengers
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
            switch(type) {
                case "water":
                    waterChoice();
                    break;
                case "air":
                    airChoice();
                    break;
                case "land":
                    landChoice();
                    break;
                default:
                    break;
            }
            return 0;
        }
    }


    // if user picks water
    public static void waterChoice() {
        Scanner input = new Scanner(System.in);
        // header
        System.out.printf("%-15s%10s%20s%20s%20s%40s%25s%n", "Mode", "Cost", "Purchase Method", "Average Speed (mph)",
                "Max Capacity", "Port Location", "Extra info");
        // makes all 3 objects
        // POLYMORPHISM, all objects shown as transportation
        Transportation boat = new Boat();
        Transportation submarine = new Submarine();
        Transportation ship = new Ship();

        // displays all of them in a table using string methods
        // string methods in classes contain polymorphism and inheritance
        System.out.printf("%s%s%s", boat, submarine, ship);

        // ask user which mode they would like to use
        System.out.printf("%n%s", "Which mode would you like to use? ");
        String mode = input.nextLine().toLowerCase();

        // type for verify and passengers in order to be able to repeat if user does not confirm mode
        String type = "water";
        // depending on what mode the user inputs, uses functions to verify, get number of passengers, get cost,
        // and get number of vehicles needed. Ends with getting travel instructions.
        switch(mode){
            case ("ship"):
                // makes object using ship in here to use get instructions
                Ship shipObject = new Ship();
                System.out.print(shipObject);
                // method to verify the choice and ask how many passengers
                int passengers = verifyAndPassengers(mode, type);
                // using total cost method in the transportation superclass (inheritance)
                System.out.printf("%s%.2f", "Your total cost is: $", shipObject.totalCost(passengers));
                // uses get instructions method (polymorphism and inheritance)
                System.out.print(shipObject.getInstructions());
                break;
            case("boat"):
                Boat boatObject = new Boat();
                System.out.print(boatObject);
                int passengers1 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", boatObject.totalCost(passengers1));
                System.out.print(boatObject.getInstructions());
                break;
            case("submarine"):
                Submarine submarineObject = new Submarine();
                System.out.print(submarineObject);
                int passengers2 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", submarineObject.totalCost(passengers2));
                System.out.print(submarineObject.getInstructions());
                break;
            // if none of the modes are entered, displays message and exits
            default:
                System.out.println("You did not enter a mode listed");
                System.exit(0);
        }


    }

    // if user picks air
    public static void airChoice(){
        Scanner input = new Scanner(System.in);
        // header
        System.out.printf("%-15s%10s%20s%20s%20s%15s%40s%25s%n", "Mode", "Cost", "Purchase Method", "Average Speed (mph)",
                "Max Capacity", "Height Max (ft)", "Airport Location", "extra info");
        // creating all instances for air
        // POLYMORPHISM. shows they can be created using transportation
        Transportation plane = new Plane();
        Transportation helicopter = new Helicopter();
        Transportation dirigible = new Dirigible();
        Transportation hotAirBalloon = new HotAirBalloon();

        // prints out string of all instances in a table
        System.out.printf("%s%s%s%s", plane, helicopter, dirigible, hotAirBalloon);

        // asks user which mode they would like to use
        System.out.printf("%n%s", "Which mode would you like to use? ");
        String mode = input.nextLine().toLowerCase();
        // type for verifyAndPassengers
        String type = "air";
        switch(mode){
            case "plane":
                Plane planeObject = new Plane();
                System.out.print(planeObject);
                // verifies mode and gets amount of passengers
                int passengers = verifyAndPassengers(mode, type);
                // total cost method in transportation superclass (inheritance)
                System.out.printf("%s%.2f", "Your total cost is: $", planeObject.totalCost(passengers));
                System.out.print(planeObject.getInstructions());
                break;
            case "helicopter":
                Helicopter helicopterObject = new Helicopter();
                System.out.print(helicopterObject);
                int passengers1 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", helicopterObject.totalCost(passengers1));
                System.out.print(helicopterObject.getInstructions());
                break;
            case "dirigible":
                Dirigible dirigibleObject = new Dirigible();
                System.out.print(dirigibleObject);
                int passengers2 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", dirigibleObject.totalCost(passengers2));
                System.out.print(dirigibleObject.getInstructions());
                break;
            case "hot air balloon":
                HotAirBalloon hotAirBalloonObject = new HotAirBalloon();
                System.out.print(hotAirBalloonObject);
                int passengers3 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", hotAirBalloonObject.totalCost(passengers3));
                System.out.print(hotAirBalloonObject.getInstructions());
                break;
            // if user does not enter mode listed, displays message and exits
            default:
                System.out.println("You did not enter a mode listed");
                System.exit(0);
        }
    }

    // if user picks land
    public static void landChoice() {
        Scanner input = new Scanner(System.in);
        // header
        System.out.printf("%-15s%10s%20s%20s%20s%20s%40s%n", "Mode", "Cost", "Purchase Method", "Average Speed (mph)",
                "Max Capacity", "Number of wheels", "location");
        // makes all 3 objects for land transportation
        // POLYMORPHISM. proves instances can be made by classifying them as transportation
        Transportation train = new Train();
        Transportation automobile = new Automobile();
        Transportation bike= new Bike();
        Transportation bus = new Bus();
        // displays all of them in a table
        System.out.printf("%s%s%s%s", train, automobile, bike, bus);

        System.out.printf("%n%s", "Which mode would you like to use? ");
        String mode = input.nextLine().toLowerCase();
        // type in choice for verifyAndPassengers method
        String type = "land";

        // depending on what mode the user inputs, uses functions to verify, get number of passengers, get cost,
        // and get number of vehicles needed. Ends with getting travel instructions.
        switch(mode){
            case ("train"):
                // makes instance using train class so get instructions may be used
                Train trainObject = new Train();
                System.out.print(trainObject);
                // method to verify the choice and ask how many passengers
                int passengers = verifyAndPassengers(mode, type);
                // using total cost method in the transportation superclass (inheritance)
                System.out.printf("%s%.2f", "Your total cost is: $", trainObject.totalCost(passengers));
                System.out.print(trainObject.getInstructions());
                break;
            case ("automobile"):
                Automobile automobileObject = new Automobile();
                System.out.print(automobileObject);
                int passengers1 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", automobileObject.totalCost(passengers1));
                System.out.print(automobileObject.getInstructions());
                break;
            case ("bike"):
                Bike bikeObject = new Bike();
                System.out.print(bikeObject);
                int passengers2 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", bikeObject.totalCost(passengers2));
                System.out.print(bikeObject.getInstructions());
                break;
            case ("bus"):
                Bus busObject = new Bus();
                System.out.print(busObject);
                int passengers3 = verifyAndPassengers(mode, type);
                System.out.printf("%s%.2f", "Your total cost is: $", busObject.totalCost(passengers3));
                System.out.print(busObject.getInstructions());
                break;
            default:
                System.out.println("You did not enter a mode listed");
                System.exit(0);
        }


    }



    public static void main(String[] args) {
        System.out.println("Welcome to the Wilmington Travel Center!");
        Scanner input = new Scanner(System.in);
        System.out.print("What type of transportation would you like to use? (Land, Air, or Water) ");
        // makes it lowercase in case user inputs it as uppercase
        String type = input.nextLine().toLowerCase();

        // type user picked
        switch(type) {
            case "water":
                waterChoice();
                break;
            case "air":
                airChoice();
                break;
            case "land":
                landChoice();
                break;
            default:
                System.out.println("You did nto enter a type of transportation. Have a good day!");
                break;
        }

    }
}
