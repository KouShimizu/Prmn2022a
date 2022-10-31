package lecture01;

public class Main {
    public static void main(String[] args) {
        //課題1-1
        System.out.println("B2211260 Ko Shimizu");

        //課題1-2
        int studentNumber = 2211260;
        System.out.println("B" + studentNumber + " Ko Shimizu");

        //課題1-3
        int age = 20;
        if(age < 20) System.out.println("I am " + age + " years old so I cannot drink liquor.");
        else System.out.println("I am " + age + " years old so I can drink liquor.");

        //課題1-4
        int[] array = new int[100];
        int sum = 0;
        int i = 0;
        for(i = 0; i < 100; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) sum = sum + array[i];
        }
        System.out.println("sum = " + sum);

        //課題1-5
        int[] score = {41, 85, 72, 38, 80};
        result(score);
        System.out.println("最高点:" + max(score) + "点");
        System.out.println("最低点:" + min(score) + "点");
        System.out.println("平均点:" + average(score) + "点");
    }
    static void result(int score[]){
        for(int i = 0; i < score.length; i++){
            System.out.print(i + "番 " + score[i] + "点 ");
            if(0 <= score[i] && score[i] < 60) System.out.println("不可");
            else if(60 <= score[i] && score[i] < 70) System.out.println("可");
            else if(70 <= score[i] && score[i] < 80) System.out.println("良");
            else if(80 <= score[i] && score[i] < 90) System.out.println("優");
            else if(90 <= score[i] && score[i] <= 100) System.out.println("秀");
            else System.out.println("error");
        }
    }
    static int min(int score[]){
        int x = 100;
        for (int item : score) {
            if (x > item) x = item;
        }
        return x;
    }
    static int max(int score[]){
        int x = 0;
        for (int item : score) {
            if (x < item) x = item;
        }
        return x;
    }
    static double average(int score[]){
        float x = 0;
        for (float item : score) x += item;
        x /= score.length;
        return x;
    }

}
