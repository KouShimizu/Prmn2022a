package lecture02;

public class Engine {  //Engineクラスはフィールドとして回転数を表すint型のrpmを持ち、引数付きコンストラクタにて初期化する
    int rpm;
    Engine (int rpm) {
        this.rpm = rpm;
    }

    void start() {  //Engineクラスは戻り値/引数無しのstart()を持ち、自身のrpmの値と”エンジンを始動させました”と表示する
        System.out.println("rpm = " + rpm + " でエンジンを始動させました。");
    }
}
