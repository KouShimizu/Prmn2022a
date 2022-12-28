package extra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Gakuseki {
    private String value;
    private final static String GAKUSEKI_RULE = "^[b|m|d][0-9]{6}0$";  // 正規表現

    public Gakuseki(String value) {
        Pattern pattern = Pattern.compile(GAKUSEKI_RULE);
        Matcher matcher = pattern.matcher(value);
        if(matcher.matches()) {
            this.value = value;
            return;
        }
        throw new RuntimeException(value + "は学籍番号じゃない");
    }

    public String getValue() {
        return value;
    }
}
