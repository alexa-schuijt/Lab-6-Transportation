public class Bike extends landTransportation {
    //instance variables
    private String rentalLocation;
    private int daysRented;

    //constructor
    Bike(){
        super(30,"rental", 15, 1,2);
        this.rentalLocation = "Hawk Wheels";
        this.daysRented = 10;
    }

    //accessors
    public String getRentalLocation() {return rentalLocation;}
    public int getDaysRented() {return daysRented;}

    //mutators
    public void setRentalLocation (String rentalLocation) {this.rentalLocation = rentalLocation;}
    public void setDaysRented (int daysRented) {this.daysRented = daysRented;}

    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%n", "Bike", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers());
    }

    public String displayInstructions(){
        return String.format("%n%s%s%n%s%s%n", "Rental location: ", getRentalLocation(), "Days Rented: ", daysRented);
    }

}
