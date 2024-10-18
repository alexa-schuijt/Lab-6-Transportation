public class submarine extends waterTransportation {
    // instance variables
    private int waterDepth = 900;

    // constructor
    submarine(){
        super(15000, "rental", 40, 35,
                "Port City Marina");
    }

    public int getWaterDepth() { return waterDepth; }
    public void setWaterDepth(int waterDepth) { this.waterDepth = waterDepth; }

    public String getInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Port location: ", getPortLocation(), "Max water depth: ",
                waterDepth);
    }
    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Submarine", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }
}
