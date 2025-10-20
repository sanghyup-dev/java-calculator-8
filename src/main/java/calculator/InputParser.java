package calculator;

import java.util.List;

public class InputParser {

    public List<Double> parse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("null 값이 입력되었습니다");
        }
        System.out.println(input);
        return List.of(); // 임시 값
    }
}
