public class Submarine extends WaterTransportation {
    // instance variables
    private int waterDepth;
    private int daysTillDeparture;

    // constructor
    Submarine(){
        super("Submarine", 15000, "rental", 40, 35,
                "Port City Marina");
        this.waterDepth = 900;
        this.daysTillDeparture = 6;
    }

    // accessor
    public int getWaterDepth() { return waterDepth; }
    public int getDaysTillDeparture() {
        return daysTillDeparture;
    }

    // mutator
    public void setWaterDepth(int waterDepth) { this.waterDepth = waterDepth; }
    public void setDaysTillDeparture(int daysTillDeparture) {
        this.daysTillDeparture = daysTillDeparture;
    }

    // methods
    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%s%s%n%d%s%n", parentString, "Max water depth: ",
                waterDepth, daysTillDeparture, " days till departure");
    }

    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%d%n%150s%d%n", parentString, "Water depth: ", getWaterDepth(),
                "Days till departure: ", daysTillDeparture);
    }
}
