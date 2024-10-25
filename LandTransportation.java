public class LandTransportation extends Transportation {
    //instance variables
    private int numOfWheels;
    private String location;

    //constructor
    LandTransportation(String name, float cost, String purchaseMethod, int averageSpeed, int numPassengers, int numOfWheels,
                       String location){
        super(name, cost, purchaseMethod, averageSpeed, numPassengers);
        this.numOfWheels = numOfWheels;
        this.location = location;
    }

    // accessor
    public int getNumOfWheels() { return numOfWheels; }
    public String getLocation() { return location; }

    // mutator
    public void setNumOfWheels ( int numOfWheels ) { this.numOfWheels = numOfWheels;}
    public void setLocation ( String location ) { this.location = location; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%20d%40s", parentString, getNumOfWheels(), getLocation());
    }

    public String getInstructions() {
        return String.format("%n%n%s%s%n%s%d", "Location: ", getLocation(), "Number of wheels: ", getNumOfWheels());
    }
}
































