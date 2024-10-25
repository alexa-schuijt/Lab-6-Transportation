public class Plane extends AirTransportation {
    // instance variables
    private String time;
    private String gate;

    Plane(){
        super("Plane", 92, "ticket", 550, 90, 42000,
                "Wilmington International Airport");
        this.time = "8:15 am on Tuesday";
        this.gate = "16B";
    }

    // accessors
    public String getTime() { return time; }
    public String getGate() { return gate; }

    // mutators
    public void setTime(String time) {
        this.time = time;
    }
    public void setGate(String gate) { this.gate = gate; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n%165s%s%n", parentString, "time leaving: ", getTime(), "Gate: ", getGate());
    }

    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n%s%s%n", parentString, "Time: ", getTime(),
                "Gate: ", getGate());
    }

}

    public String getInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Airport: ", airportLocation, "Time: ", time);
    }
}
