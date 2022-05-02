package Months;

public class Party {

    private String eventName;
    private int guestNumber;
    private Months partymonth;



    // constructor

    // when we create a party this is the info we must pass

    public Party(String eventName, int guestNumber, Months partymonth){
        this.eventName= eventName;
        this.guestNumber= guestNumber;
        this.partymonth= partymonth;
    }


    // getters and setters


    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    public Months getPartymonth() {
        return partymonth;
    }

    public void setPartymonth(Months partymonth) {
        this.partymonth = partymonth;
    }


    // to string


    @Override
    public String toString() {
        return "Party{" +
                "eventName='" + eventName + '\'' +
                ", guestNumber=" + guestNumber +
                ", partymonth=" + partymonth +
                '}';
    }
}
