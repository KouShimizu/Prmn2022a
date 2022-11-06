package lecture02;

public class Exercise2_2 {
    public static void main(String[] args) {

        GasStation gs = new GasStation();
        Car car = new Car();

        car.run();
        gs.refuel(car);
        car.run();
    }
}
