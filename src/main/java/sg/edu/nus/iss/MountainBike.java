package sg.edu.nus.iss;

public class MountainBike extends Bicycle {
    
    public int seatHeight;// class level attribute

    public int getSeatHeight() {
        return this.seatHeight;
    }


    
    public MountainBike(int seatHeight) {
        this.seatHeight = seatHeight; //this.seatHeight = class level arrtibute; function seatHeight = class seatheight 
    }



    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }



    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }



    @Override
    public String toString() {
        //return "MountainBike [seatHeight=" + seatHeight + "]";
        return super.toString() + "\nSeat Height= " + seatHeight;
    }

    
}
