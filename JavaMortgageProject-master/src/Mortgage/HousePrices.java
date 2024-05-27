package Mortgage;
public class HousePrices extends Users {

    private int price;

    public HousePrices(String username, String whichCondtiton, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whichCondtiton, houseType, roomCount, downPayment, longTerm, statesTax);

        roomCountToPrice();
        conditionToPrice();
        houseTypeToPrice();
        calculateTax();
        getPriceEachMonth();
    }

    void roomCountToPrice(){
        if (getRoomCount()==0)
            price+=10000;
        else if (getRoomCount()==1)
            price+=20000;
        else if (getRoomCount()==2)
            price+=30000;
        else if (getRoomCount()==3)
            price+=40000;
        else if (getRoomCount()==4)
            price+=50000;
        else if (getRoomCount()==5)
            price+=60000;
    }

    void conditionToPrice() {
        if (getWhichCondtiton().equalsIgnoreCase("new"))
            price+=50000;
        else if (getWhichCondtiton().equalsIgnoreCase("like new"))
            price+=40000;
        else if (getWhichCondtiton().equalsIgnoreCase("old"))
            price+=30000;
        else if (getWhichCondtiton().equalsIgnoreCase("renew required"))
            price+=15000;
    }

    void houseTypeToPrice() {
        if (getHouseType().equalsIgnoreCase("apartment"))
            price += 20000;
        else if (getHouseType().equalsIgnoreCase("condo"))
            price += 30000;
        else if (getHouseType().equalsIgnoreCase("house"))
            price += 40000;
    }

    void calculateTax(){
        price+=price*(getStatesTax().getTax())/100;
    }

    public int getPriceTotal() {
        return price;
    }
    public int getPriceEachMonth(){

        return (getPriceTotal()-getDownPayment())/getLongTerm();
    }
}




