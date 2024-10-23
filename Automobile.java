public class Automobile extends landTransportation {
    //instance variables
    private String rentalLocation;
    private double milesPerGallon;

    //constructor
    Automobile(){
        super(150,"rental",45, 5,4);
        this.rentalLocation = "Enterprise Rent-A-Car";
        this.milesPerGallon = 19.5;
    }

    //accessors
    private String getRentalLocation() {return rentalLocation;}
    private double getMilesPerGallon() {return milesPerGallon;}

    //mutator
    public void setRentalLocation (String rentalLocation) {this.rentalLocation = rentalLocation;}
    public void setMilesPerGallon(double milesPerGallon) {this.milesPerGallon = milesPerGallon;}

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Automobile", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }

    public String displayInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Rental location: ", getRentalLocation(), "Miles Per Gallon: ", milesPerGallon);
    }


}
