package model;
//Like abstract classes, interfaces cannot be used to create objects.
//An interface cannot contain a constructor (as it cannot be used to create objects)
public interface IRoom {
    //Interface methods are by default abstract and public
    //Interface attributes are by default public, static and final
    //Interface methods do not have a body - the body is provided by the "implement" class

    public String getRoomNumber();
    public double getRoomPrice();
    public RoomType getRoomType();
    public boolean isFree();


}
