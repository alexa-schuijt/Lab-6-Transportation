public class Ship extends WaterTransportation {
    // instance variable
    private String timeLeaving;

    // constructor
    Ship(){
        super("Ship", 500, "ticket", 30, 1652,
                "Morehead City Port");
        this.timeLeaving = "10:00 am on Monday/Fridays";
    }

    // accessors
    public String getTimeLeaving() { return timeLeaving; }
    // mutators
    public void setTimeLeaving(String time) { this.timeLeaving = timeLeaving; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%20s%s%n", parentString,"Time leaving: ", getTimeLeaving());
    }

    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%s%s%n", parentString, "Time leaving: ", timeLeaving);
    }


}
