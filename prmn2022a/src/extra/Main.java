package extra;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(new Gakuseki("b2211260"), "Ko Shimizu", new Age(20));
        Student s2 = new Student(new Gakuseki("あああああ"), "Ko Shimizu", new Age(-10));
    }
}
