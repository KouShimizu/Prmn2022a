package extra;

public class Age {
    private int value;

    public Age(int value) {
        if((0<=value) && (value<=120)) {
            this.value = value;
            return;
        }
        throw new RuntimeException(value + "は不正な年齢です");
    }

    public boolean isOver20() {
        return (value>=20);
    }

    public int getValue() {
        return value;
    }
}
