public class Bike extends LandTransportation {
    //instance variables
    private int daysRented;
    private Boolean isItElectric;

    //constructor
    Bike(){
        super("Bike", 30,"rental", 15, 1,2,
                "Hawk Wheels");
        this.daysRented = 10;
        this.isItElectric = true;
    }

    //accessors
    public int getDaysRented() {return daysRented;}

    public Boolean getItElectric() {
        return isItElectric; }

    //mutators
    public void setDaysRented (int daysRented) {this.daysRented = daysRented;}

    public void setIsItElectric(Boolean isItElectric) {
        this.isItElectric = isItElectric; }

    // methods
    @Override
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n%170s%s%n", parentString, "Days rented: ", daysRented, "Electric bike? ",
                (isItElectric ? "Yes" : "No:"));
    }

    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%s%n%s", parentString, "Days Rented: ", daysRented,
                (isItElectric ? "Bikes are electric" : "Bikes are not electric"));
    }

}

