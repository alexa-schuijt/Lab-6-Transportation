public class Dirigible extends airTransportation{
    private String reservationWaitTime;

    Dirigible(){
        super(800, "rental", 110, 6, 6000);
        this.reservationWaitTime = "25 minutes";
    }

    public String getReservationWaitTime() { return reservationWaitTime; }

    public void setreservationWaitTime(String reservationWaitTime) {
        this.reservationWaitTime = reservationWaitTime;
    }


    @Override
    public String toString() {
        return String.format("%-20s%20.2f%20s%20d%20d%20d%n", "Dirigible", getCost(), getPurchaseMethod(),
                getAverageSpeed(), getNumPassengers(), getHeightMax());
    }

    public String getInstructions(){
        return String.format("%n%s%s%n", "Your reservation wait time: ", reservationWaitTime);
    }
    
}
