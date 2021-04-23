public class CarTester {


    public static void main(String[] args) {


        Car car = new Car();

        car.make = "Bugatti";
        car.model = "Veyron";
        car.color = "Blue";
        car.hasLeather = false;
        car.mileage = 100;
        car.year = 2021;
        car.vin = "GVGV5665HJVHVJH66FG";



        System.out.println(car.getInfo());



        Car car2 = new Car("Audi", "R8", "Red");

        System.out.println(car2.getInfo());


//        String str = new String();
//        String str2 = new String("Hello");
//        String str3 = new String (new char[] {'h', 'i'});


//        Phone ph = new Phone();





    }
}
