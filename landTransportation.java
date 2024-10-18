public class landTransportation extends Transportation {
    //instance variables
    private String[] options;
    private int numOfWheels;

    //constructor
    landTransportation(float cost, String purchaseMethod, int averageSpeed, int numPassengers, int numOfWheels){
        super(cost, purchaseMethod, averageSpeed, numPassengers);
        this.numOfWheels = numOfWheels;
    }

    public int getNumOfWheels() { return numOfWheels; }

    public void setNumOfWheels ( int numOfWheels ) { this.numOfWheels = numOfWheels;}



}
































