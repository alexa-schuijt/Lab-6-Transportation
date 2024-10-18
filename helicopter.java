public class helicopter extends airTransportation{
    private String helipadLocation;

    helicopter(){
        super(650, "rental", 110, 6, 6000);
        this.helipadLocation = "NHRMC-Ed North Heliport";
    }

    public String getHelipadLocation() { return helipadLocation; }

    public void setHelipadLocation(String helipadLocation) {
        this.helipadLocation = helipadLocation;
    }


    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%20d%n", "Helicopter", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers(), getHeightMax());
    }

    public String getInstructions(){
        return String.format("%n%s%s%n", "Helipad Location: ", helipadLocation);
    }
}

