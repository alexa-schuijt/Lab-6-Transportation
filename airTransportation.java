public class airTransportation extends Transportation{
    // instance variables
    private String[] options;
    private int heightMax;

    // constructor
    airTransportation(float cost, String purchaseMethod, int averageSpeed, int numPassengers,
                      int heightMax){
        super(cost, purchaseMethod, averageSpeed, numPassengers);
        this.heightMax = heightMax;
    }

    public int getHeightMax() { return heightMax; }

    public void setHeightMax( int heightMax ){ this.heightMax = heightMax; }


}
