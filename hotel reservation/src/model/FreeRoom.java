package model;

//To inherit from a class, use the extends keyword
public class FreeRoom extends Room{

    public FreeRoom(String roomNumber,double price,RoomType enumeration)    {
        super(roomNumber,0.0,enumeration);




    }
    //override toString() java method to return the object for better description

    @Override
    public String toString() {
        return "FreeRoom{" +
                "price=" + price +
                '}';
    }



}
