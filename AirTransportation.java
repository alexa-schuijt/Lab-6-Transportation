public class AirTransportation extends Transportation{
    // instance variables
    private int heightMax;
    private String airportLocation;

    // constructor
    AirTransportation(String name, double cost, String purchaseMethod, int averageSpeed, int numPassengers,
                      int heightMax, String airportLocation){
        super(name, cost, purchaseMethod, averageSpeed, numPassengers);
        this.heightMax = heightMax;
        this.airportLocation = airportLocation;
    }

    //accessors
    public int getHeightMax() { return heightMax; }
    public String getAirportLocation() { return airportLocation; }

    //mutators
    public void setHeightMax( int heightMax ){ this.heightMax = heightMax; }
    public void setAirportLocation(String airportLocation) { this.airportLocation = airportLocation; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%15d%40s", parentString, getHeightMax(), getAirportLocation());
    }

    public String getInstructions() {
        return String.format("%n%n%s%s%n%s%d", "Location: ", getAirportLocation(), "Height Max: ", getHeightMax());
    }

}
