public class HotAirBalloon extends AirTransportation{
    //instance variables
    private String cantFlyConditions;
    private int daysTillFly;

    //constructor
    HotAirBalloon(){
        super("Hot Air Balloon", 650, "rental", 10, 5, 5000,
                "Long Leaf Park");
        this.cantFlyConditions = "Rain, snow, or storms within 5 miles.";
        this.daysTillFly = 9;
    }

    // accessors
    public String getCantFlyConditions() { return cantFlyConditions; }
    public int getDaysTillFly() { return daysTillFly; }

    // mutators
    public void setCantFlyConditions(String cantFlyConditions) {
        this.cantFlyConditions = cantFlyConditions;
    }
    public void setDaysTillFly(int daysTillFly) {
        this.daysTillFly = daysTillFly; }

    // methods
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n%165s%d", parentString, "Can't fly conditions: ", cantFlyConditions,
                "Days till fly: ", getDaysTillFly());
    }

    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n%s%d%s%n", parentString,
                "Can't fly in these conditions: ", cantFlyConditions, "You will fly in ", daysTillFly, " days");
    }
}
