package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.print("1つ目の整数を入力して下さい：\n> ");
        a = Integer.parseInt(input.nextLine());
        System.out.print("2つ目の整数を入力して下さい：\n> ");
        b = Integer.parseInt(input.nextLine());

        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
