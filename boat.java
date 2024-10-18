public class boat extends waterTransportation{
    // instance variable
    private String captainName = "Captain Johnny";

    // constructor
    boat(){
        super(400, "rental", 22, 8,
                "Wrightsville Beach Marina");
    }

    public String getCaptainName() { return captainName; }
    public void setCaptainName(String captainName ) { this.captainName = captainName; }

    public String getInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Port Location: ", getPortLocation(), "Captain's Name: ", captainName);
    }

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Boat", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }
}
