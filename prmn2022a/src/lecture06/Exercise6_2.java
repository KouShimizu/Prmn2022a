package lecture06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        System.out.println();

        for (int i = 0; i < 5; i++) {
            list.add(random.nextInt(6)+1);
        }
        System.out.println("さいころを5つ振りました。\n何番目のさいころの値を確認しますか？");
        try {
            int idx = input.nextInt();
            System.out.println(idx + "番目のさいころの値は" + list.get(idx));
        } catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲以外アクセスを確認しました。\nプログラムを終了します。");
        } catch (InputMismatchException e) {
            System.out.println("整数以外の値が入力されました。\nプログラムを終了します。");
        }

    }
}
