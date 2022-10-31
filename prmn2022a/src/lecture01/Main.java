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

    }
}
