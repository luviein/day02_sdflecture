package sg.edu.nus.iss;

public class RoadBike extends Bicycle {
    public int seatHeight;// class level attribute

    public int getSeatHeight() {
        return this.seatHeight;
    }


    
    public RoadBike(int seatHeight) {
        this.seatHeight = seatHeight; //this.seatHeight = class level arrtibute; function seatHeight = class seatheight 
    }



    public RoadBike(int gear, int speed, int seatHeight) {
        super(gear, speed); //can override bicycle
        this.seatHeight = seatHeight;
    }



    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }



    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight + "]";
        //return "Mountain Bike" + "\nSeat Height= " + seatHeight;
        return super.toString() + "Seat Height=" + seatHeight +"\n"; //If there is no parent tostring, it will generate hashcode 

    
}
 
}
