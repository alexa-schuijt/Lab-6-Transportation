public class hotAirBalloon extends airTransportation{
    private String cantFlyConditions;

    hotAirBalloon(){
        super(650, "rental", 110, 6, 6000);
        this.cantFlyConditions = "Rain, snow, or storms within 5 miles.";
    }

    public String getCantFlyConditions() { return cantFlyConditions; }

    public void setCantFlyConditions(String cantFlyConditions) {
        this.cantFlyConditions = cantFlyConditions;
    }


    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%20d%n", "Hot Air Balloon", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers(), getHeightMax());
    }

    public String getInstructions(){
        return String.format("%n%s%s%n", "Can't fly in these conditions: ", cantFlyConditions);
    }
}