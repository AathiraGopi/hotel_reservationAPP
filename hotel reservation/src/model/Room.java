package model;

//superclass (parent) - the class being inherited from

import java.util.Objects;

public class Room implements IRoom {

    //set attributes as protected access modifier  instead of private - to access by sub class
    protected String roomNumber;
    protected  double price;
    protected RoomType roomType;
    public Room(String roomNumber,double price,RoomType roomType)
{
    this.roomNumber=roomNumber;
    this.price=price;
    this.roomType= roomType;
}


    //interface abstract methods should be overriden

    @Override
    public String getRoomNumber() {
        return roomNumber;
    }

    @Override
    public double getRoomPrice() {
        return price;
    }

    @Override
    public RoomType getRoomType() {

        return roomType;
    }

    @Override
    public boolean isFree() {

        return false;
    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }





    @Override
    public String toString() {
        return "Room{" +
                "roomNumber='" + roomNumber + '\'' +
                ", price=" + price +
                ", enumeration=" + roomType +
                '}';
    }
        @Override
        public int hashCode() {
            return roomNumber != null ? roomNumber.hashCode() : 0;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj ==null || this.getClass() != obj.getClass()) return false;
            Room room = (Room) obj;
            return Objects.equals(roomNumber, room.roomNumber);
        }

        public void setRoomNumber(String roomNumber) {
            this.roomNumber = roomNumber;
        }

        public void setPrice(Double price) {
            this.price = price;
        }

        public void setRoomType(RoomType roomType) {
            this.roomType = roomType;
        }
    }
