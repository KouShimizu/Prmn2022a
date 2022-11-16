package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();
        System.out.print("何行分入力しますか？\n> ");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + "行目：\n> ");
            strings.add(input.nextLine());
        }
        System.out.println("入力した文字列：");
        int idx=0;
        for(String string : strings) {
            System.out.println("[" + idx + "] " + string);
            idx++;
        }
    }
}
