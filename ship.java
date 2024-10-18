public class ship extends waterTransportation{
    // instance variable
    private String time;

    // constructor
    ship(){
        super(500, "ticket", 30, 1652,
                "Morehead City Port");
        this.time = "10:00 am on Monday/Fridays";
    }

    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Ship", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }

    public String getInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Port location: ", getPortLocation(), "Time: ", time);
    }
}
