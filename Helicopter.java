public class Helicopter extends AirTransportation {
    //instance variables
    private int numberOfBlades;
    private String takeOffDate;
    private int hoursRented;

    // constructor
    Helicopter(){
        super("Helicopter", 650, "rental", 110, 6, 6000,
                "NHRMC-Ed North Heliport");
        this.numberOfBlades = 5;
        this.takeOffDate = "Tuesday at 12pm";
        this.hoursRented = 8;
    }

    // accessors
    public int getNumberOfBlades() { return numberOfBlades; }

    public String getTakeOffDate() {
        return takeOffDate; }

    public int getHoursRented() {
        return hoursRented; }

    //mutators
    public void setNumberOfBlades(int numberOfBlades) {this.numberOfBlades = numberOfBlades;}

    public void setTakeOffDate(String takeOffDate) {
        this.takeOffDate = takeOffDate; }

    public void setHoursRented(int hoursRented) {
        this.hoursRented = hoursRented; }

    // to string method using polymorphism and inheritance
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%d%n%165s%s%n%165s%s%n", parentString, "number of blades: ", getNumberOfBlades(),
                "Take off day: ", getTakeOffDate(), "Hours rented: ", getHoursRented());
    }

    // gets instructions
    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n%s%d%n", parentString, "Take off date: ",
                getTakeOffDate(), "Hours rented: ", getHoursRented());
    }
}

