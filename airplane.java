public class airplane extends airTransportation{
    private String airportLocation;
    private String time;

    airplane(){
        super(92, "ticket", 550, 90, 42000);
        this.airportLocation = "Wilmington International Airport";
        this.time = "8:15 am on Tuesday";
    }

    public String getAirportLocation() { return airportLocation; }
    public String getTime() { return time; }

    public void setAirportLocation(String airportLocation) {
        this.airportLocation = airportLocation;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%20d%n", "Airplane", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers(), getHeightMax());
    }

    public String getInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Airport: ", airportLocation, "Time: ", time);
    }
}
