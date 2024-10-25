public class Dirigible extends AirTransportation{
    // instance variable
    private String reservationWaitTime;

    // constructor
    Dirigible(){
        super("Dirigible", 600, "ticket", 40, 6, 10000,
                "Weeksville Naval Air Station");
        this.reservationWaitTime = "4 weeks";
    }

    // accessors
    public String getReservationWaitTime() { return reservationWaitTime; }

    //mutators
    public void setReservationWaitTime(String reservationWaitTime) {
        this.reservationWaitTime = reservationWaitTime;
    }

    // methods
    public String toString() {
        String parentString = super.toString();
        return String.format("%s%25s%s%n", parentString, "Reservation wait time: ", getReservationWaitTime());
    }

    public String getInstructions(){
        String parentString = super.getInstructions();
        return String.format("%s%n%s%n%s%s%n", parentString,
                "There are less than 20 dirigibles in the United States! You will " +
                "have a long wait time!", "Your reservation wait time: ", getReservationWaitTime());
    }

}
