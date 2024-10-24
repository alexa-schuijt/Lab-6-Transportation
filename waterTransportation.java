public class WaterTransportation extends Transportation{
    // instance variables
    private String portLocation;
    private String[] options;

    // constructor
    waterTransportation(float cost, String purchaseMethod, int averageSpeed, int numPassengers, String portLocation){
      super(cost, purchaseMethod, averageSpeed, numPassengers);
        this.portLocation = portLocation;
    }

    public String getPortLocation() { return portLocation; }

    public void setPortLocation(String portLocation){
        this.portLocation = portLocation;
    }

}
