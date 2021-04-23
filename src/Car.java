public class Car {

    // instance variables
    int speed;
    int year;
    int mileage;
    boolean hasLeather;
    String make;
    String model;
    String color;
    boolean isAWD;
    String vin;
    boolean isOn = false;

    // Constructor

    public Car(){
        System.out.println("Constructor is called");
    }

    public Car(boolean on){

        this.isOn = on;

    }

    public Car(int newYear){

        this.year = newYear;

    }




    public Car(String make, String model, String color){

        this.make = make;
        this.model = model;
        this.color = color;
    }





  // instance
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }

    public void accelerate(){
        if(isOn)
        speed++;
    }

    public void decelerate(){
        if(isOn)
        speed--;
    }


    public void setColor(String color ){
        this.color = color;
    }



    public String getInfo() {
        return
                "speed=" + this.speed +
                ", year=" + year +
                ", mileage=" + mileage +
                ", hasLeather=" + hasLeather +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", isAWD=" + isAWD +
                ", vin='" + vin + '\'' +
                ", isOn=" + isOn ;
    }
}
