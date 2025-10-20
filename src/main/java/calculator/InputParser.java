package calculator;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputParser {

    private final Set<Character> delimiterSet = new HashSet<>();

    public InputParser() {
        delimiterSet.add(',');
        delimiterSet.add(':');
    }

    public List<Double> parse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("null 값이 입력되었습니다");
        }
        System.out.println(input);
        return List.of(); // 임시 값
    }
}
