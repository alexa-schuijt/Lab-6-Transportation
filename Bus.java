public class Bus extends landTransportation{
    //instance variables
    private String timesDeparting;

    //constructor
    Bus(){
        super(70, "ticket",45, 35, 6);
        this.timesDeparting = "9:15 am Mondays/Wednesdays";
    }

    //accessors
    public String getTimesDeparting() {return timesDeparting;}

    //mutators
    public void setTimesDeparting (String timesDeparting) {this.timesDeparting = timesDeparting;}

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Bus", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }

    public String displayInstructions(){
        return String.format("%n%s%s%n", "Times Departing: ", getTimesDeparting());
    }



}
