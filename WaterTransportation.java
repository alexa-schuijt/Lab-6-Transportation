public class WaterTransportation extends Transportation{
    // instance variables
    private String portLocation;

    // constructor
    WaterTransportation(String name, double cost, String purchaseMethod, int averageSpeed, int numPassengers, String portLocation){
      super(name, cost, purchaseMethod, averageSpeed, numPassengers);
        this.portLocation = portLocation;
    }

    // accessor
    public String getPortLocation() { return portLocation; }

    // mutator
    public void setPortLocation(String portLocation){
        this.portLocation = portLocation;
    }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%40s", parentString, getPortLocation());
    }

    public String getInstructions(){
        return String.format("%n%n%s%s%n", "Port location: ", getPortLocation());
    }
}
