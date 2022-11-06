package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];  //Tire型の配列tires(最大要素数4,要素数4)をインスタンス化(sizeは全て65)
        for (int i = 0; i < tires.length; i++) tires[i] = new Tire(65);
        Engine engine = new Engine(4000);  //Engine型のengineをインスタンス化(rpmは4,000)

        Car car = new Car(tires, engine);  //これらをCarのコンストラクタに渡してCar型のcarをインスタンス化
        GasStation gs = new GasStation();  //GasStation型のgasStationをインスタンス化し、refuel()でcarに給油する
        gs.refuel(car);

        car.startEngine();  //CarのstartEngine()、run()を呼び出しなさい
        car.run();
    }
}

