package extra;

public class Student {
    private Gakuseki gakuseki;
    private String name;
    private Age age;

    public Student(Gakuseki gakuseki, String name, Age age) {
        this.gakuseki = gakuseki;
        this.name = name;
        this.age = age;
    }

    public boolean isOver20() {
        return age.isOver20();
    }

    public Gakuseki getGakuseki() {
        return gakuseki;
    }

    public String getName() {
        return name;
    }

    public Age getAge() {
        return age;
    }
}
