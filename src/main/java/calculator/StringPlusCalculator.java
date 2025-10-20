package calculator;

import java.util.List;

public class StringPlusCalculator {
    private final InputParser inputParser;

    public StringPlusCalculator(InputParser inputParser) {
        this.inputParser = inputParser;
    }

    public double add(String input) {
        List<Double> numbers = inputParser.parse(input);

        return 0; // 임시 값
    }
}
