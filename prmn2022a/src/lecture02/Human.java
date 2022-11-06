package lecture02;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println(studentChecker() + name + " " + age + "歳です。");
    }

    String studentChecker() {
        if (age < 0 || 120 < age) {
            System.out.println("エラー");
            System.exit(1);
        }
        if (age <= 6) return "幼児:";
        else if (age <= 12) return "児童:";
        else if (age <= 18) return "生徒:";
        else if (age <= 22) return "学生:";
        else return "";
    }

}
