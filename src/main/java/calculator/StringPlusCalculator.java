package calculator;

import java.util.List;

public class StringPlusCalculator {
    private final InputParser inputParser;

    public StringPlusCalculator(InputParser inputParser) {
        this.inputParser = inputParser;
    }

    public Double add(String input) {
        List<Double> numbers = inputParser.parse(input);
        return sum(numbers);
    }

    private double sum(List<Double> numbers) {
        double result = 0.0;
        for (double v : numbers) {
            result += v;
        }
        return result;
    }
}
