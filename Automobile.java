public class Automobile extends LandTransportation {
    //instance variables
    private double milesPerGallon;
    private int hoursRented;

    //constructor
    Automobile(){
        super("Automobile", 150,"rental",45, 5,4,
                "Enterprise Rent-A-Car");
        this.milesPerGallon = 19.5;
        this.hoursRented = 48;
    }

    //accessors
    public double getMilesPerGallon() {return milesPerGallon;}
    public int getTimeRented() { return hoursRented; }

    //mutator
    public void setMilesPerGallon(double milesPerGallon) {this.milesPerGallon = milesPerGallon;}
    public void setTimeRented ( int timeRented ) { this.hoursRented = timeRented; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%.2f%n%170s%d%n", parentString, "MPG: ", milesPerGallon, "hours rented: ",
                hoursRented);
    }

    @Override
    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n%s%d%n", parentString , "Miles Per Gallon: ",
                milesPerGallon, "Hours rented: ", hoursRented);
    }


}

