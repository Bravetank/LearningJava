package class_practice2;


public class Event {
    private String name;
    private String date;
    private int numberOfGuests;
    private double costPerGuest = 40;
    private String eventNumber; //Needs to start with first letter of event (so charAt(0) then a number & next number needs to add 1 to it
    private double total = 0.0;

    public Event(String name) {
        this.name = name;
    }

    public Event(String type, String date) {
        this.name = type;
        this.date = date;
    }

    public Event(String name, String date, int numberOfGuests) {
        this.name = name;
        this.date = date;
        this.numberOfGuests = numberOfGuests;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public double getCostPerGuest() {
        return costPerGuest;
    }

    public void setCostPerGuest(double costPerGuest) {
        this.costPerGuest = costPerGuest;
    }

    public String getEventNumber() {
        return eventNumber;
    }

    public String setEventNumber(String name, int count) {
        char firstLetter = name.charAt(0);
        eventNumber = firstLetter + String.valueOf(count);
        return eventNumber;
    }

   public double total(int numberOfGuests){

        total = numberOfGuests * costPerGuest;
        return total;
   }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", numberOfGuests=" + numberOfGuests +
                ", costPerGuest=" + costPerGuest +
                ", totalCost=" + total +
                ", eventNumber=" + eventNumber +
                '}';
    }

}
