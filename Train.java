public class Train extends LandTransportation{
    //instance variables
    private String timesDeparting;
    private String railType;

    //constructor
    Train(){
        super("Train", 50, "ticket", 55,450,24,
                "Wave Forden Station transit center");
        this.timesDeparting = "9:00 am Monday-Friday";
        this.railType = "high-speed";
    }
    //accessors
    public String getTimesDeparting() {return timesDeparting;}
    public String getRailType() { return railType; }

    //mutators
    public void setTimesDeparting (String timesDeparting) {this.timesDeparting = timesDeparting;}
    public void setRailType (String railType ) {this.railType = railType; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n%170s%s%n", parentString, "Times Departing: ", timesDeparting, "rail type: ",
                railType);
    }

    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n%s%s%n", parentString, "Times Departing: ", timesDeparting,
                "rail type: ", railType);
    }
}
