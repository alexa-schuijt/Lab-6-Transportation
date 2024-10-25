public class Boat extends WaterTransportation {
    // instance variable
    private String captainName;
    private int hoursRented;

    // constructor
    Boat(){
        super("Boat", 400, "rental", 22, 8,
                "Wrightsville Beach Marina");
        this.captainName = "Captain Jonny";
        this.hoursRented = 12;
    }

    // accessors
    public String getCaptainName() { return captainName; }
    public int getHoursRented() {
        return hoursRented; }

    // mutators
    public void setCaptainName(String captainName ) { this.captainName = captainName; }
    public void setHoursRented(int hoursRented) {
        this.hoursRented = hoursRented; }

    // methods
    @Override
    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%s%s%n%s%d", parentString, "Captain's Name: ", captainName,
                "Hours rented: ", hoursRented);
    }

    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n%150s%d%n", parentString, "Captain name: ", getCaptainName(),
                "Hours rented: ", hoursRented);
    }
}
