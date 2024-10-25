public class Bus extends LandTransportation{
    //instance variables
    private String timesDeparting;

    //constructor
    Bus(){
        super("Bus", 70, "ticket",45, 35, 6,
                "Greyhound Bus Stop");
        this.timesDeparting = "9:15 am Mondays/Wednesdays";
    }

    //accessors
    public String getTimesDeparting() {return timesDeparting;}

    //mutators
    public void setTimesDeparting (String timesDeparting) {this.timesDeparting = timesDeparting;}

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n", parentString, "Times Departing: ", timesDeparting);
    }


    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n", parentString, "Times Departing: ", getTimesDeparting());
    }



}



}
