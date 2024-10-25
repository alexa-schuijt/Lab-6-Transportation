public class Transportation {
    // instance variables
    private String name;
    private double cost;
    private String purchaseMethod;
    private int averageSpeed;
    private int numPassengers;

    // constructor
    Transportation(String name, double cost, String purchaseMethod, int averageSpeed, int numPassengers){
        this.name = name;
        this.cost = cost;
        this.purchaseMethod = purchaseMethod;
        this.averageSpeed = averageSpeed;
        this.numPassengers = numPassengers;
    }


    // accessors
    public String getName() { return name; }
    public double getCost() { return cost; }
    public String getPurchaseMethod() { return purchaseMethod; }
    public int getAverageSpeed() { return averageSpeed; }
    public int getNumPassengers() { return numPassengers; }

    // mutators
    public void setName(String name) { this.name = name; }
    public void setCost(float cost) {
        this.cost = cost;
    }
    public void setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
    }
    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    // total cost method, if less than 1 system exits, if ticket multiplies cost by ticket, if rental multiplies
    // number needed by ticket
    public double totalCost(int passengers) {
        if (passengers < 1) {
            System.out.print("You must have at least one passenger");
            System.exit(0);
        }
        if (purchaseMethod.equals("ticket")) {
            if (getNumPassengers() < passengers){
                System.out.printf("%n%s%d%n%s", "Max capacity is ", getNumPassengers(),
                        "You cannot buy that many tickets!");
                System.exit(0);
            }
            else{
                return getCost() * passengers; }
        }
        if (purchaseMethod.equals("rental")) {
            float ratio = (float) passengers / numPassengers;
            int numberNeeded = (int) Math.ceil(ratio);
            System.out.printf("%n%s%d%n", "You will need to rent ", numberNeeded);
            return cost * numberNeeded;
        }
        else{
            System.out.print("Not valid purchase method");
            System.exit(0);
            return 0;
        }
    }


    // Origonal to string method for all classes
    public String toString() {
        return String.format("%-15s%10.2f%20s%20d%20d", getName(), getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }

}
