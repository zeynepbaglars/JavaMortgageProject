package Mortgage;

public class Users {

    private String username;
    private String whichCondtiton;
    private String houseType;
    private int roomCount;
    private int downPayment;
    private int longTerm;
    private StatesTax statesTax;

    public Users(String username, String whichCondtiton, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        this.username = username;
        this.whichCondtiton = whichCondtiton;
        this.houseType = houseType;
        this.roomCount = roomCount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statesTax = statesTax;
    }

    public String getUsername() {
        return username;
    }

    public String getWhichCondtiton() {
        return whichCondtiton;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }
}

