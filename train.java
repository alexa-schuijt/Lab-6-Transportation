public class train extends landTransportation{
    //instance variables
    private String stationLocation;
    private String timesDeparting;

    //constructor
    train(){
        super(150, "ticket", 55,1000,24);
        this.stationLocation= "Wave Forden Station transit center 505 Cando Street ";
        this.timesDeparting = "9:00 am Monday-Friday";
    }

    public String getTimesDeparting() {return timesDeparting;}
    public String getStationLocation() {return stationLocation;}

    public void setTimesDeparting (String timesDeparting) {this.timesDeparting = timesDeparting;}
    public void setStationLocation (String stationLocation) {this.stationLocation = stationLocation;}

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Train", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }

    public String displayInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Station location: ", getStationLocation(), "Times Departing: ", timesDeparting);
    }
}
