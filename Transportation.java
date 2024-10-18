
public class Transportation {
    // instance variables
    private String[] types = {"Air", "Land", "Water"};
    private float cost;
    private String purchaseMethod;
    private int averageSpeed;
    private int numPassengers;

    // constructor
    Transportation(float cost, String purchaseMethod, int averageSpeed, int numPassengers){
        this.cost = cost;
        this.purchaseMethod = purchaseMethod;
        this.averageSpeed = averageSpeed;
        this.numPassengers = numPassengers;
    }


    // accessors
    public float getCost() { return cost; }
    public String getPurchaseMethod() { return purchaseMethod; }
    public int getAverageSpeed() { return averageSpeed; }
    public int getNumPassengers() { return numPassengers; }

    // mutators
    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setPurchaseMethod(String purchaseMethod) {
        this.purchaseMethod = purchaseMethod;
    }

    public void setAverageSpeed(int averageSpeed) {
        this.averageSpeed = averageSpeed;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }


}
