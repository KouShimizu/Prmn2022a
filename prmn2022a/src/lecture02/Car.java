package lecture02;

public class Car {
    int fuel;
    Tire[] tires;  //Carクラスのフィールドに、Tire型の配列tiresと、Engine型のengineを定義しなさい
    Engine engine;

    Car (){}
    /*Carの引数無しコンストラクタを書き換え、Tire型のインスタンスの配列tires、
    Engine型のengineを受け取るようにし、上で定義したフィールドに代入しなさい*/
    Car (Tire[] tires, Engine engine){
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }

    void startEngine() {  //Carクラスに戻り値/引数無しのstartEngine()を追加し、自身のengineのstart()を呼び出す
        this.engine.start();
    }

    void run() {
        if (fuel < 0) {
            System.out.println("エラー");
            System.exit(1);
        }
        if (fuel > 0) {
            fuel--;
            System.out.println("燃料を1消費して走りました。");
        }
        else System.out.println("燃料が足りないため走れませんでした。");
    }

}
