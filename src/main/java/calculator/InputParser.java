package calculator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InputParser {

    private final Set<Character> commonDelimiterSet = new HashSet<>();

    public InputParser() {
        commonDelimiterSet.add(',');
        commonDelimiterSet.add(':');
    }

    public List<Double> parse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("null 값이 입력되었습니다");
        }

        Set<Character> delimiters = new HashSet<>(commonDelimiterSet);

        if (hasCustomHeader(input)) {
            input = applyCustomHeader(input, delimiters);
        }

        List<String> tokens = splitTokens(input, delimiters);

        List<Double> number = toDouble(tokens);

        System.out.println(number);

        return List.of(); // 임시 값
    }


    private boolean hasCustomHeader(String input) {
        if (input.length() >= 5 && input.charAt(0) == '/' && input.charAt(1) == '/'
                && input.charAt(3) == '\\' && input.charAt(4) == 'n') {
            return true;
        }
        return false;
    }

    private String applyCustomHeader(String input, Set<Character> delimiters) {
        delimiters.add(input.charAt(2));
        return input.substring(5);
    }

    private List<String> splitTokens(String input, Set<Character> delimiters) {
        List<String> tokens = new ArrayList<>();

        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (delimiters.contains(c)) {
                if (!buffer.isEmpty()) {
                    tokens.add(buffer.toString());
                    buffer.setLength(0);
                }
            } else {
                buffer.append(c);
            }
        }
        if (!buffer.isEmpty()) {
            tokens.add(buffer.toString());
        }

        return tokens;
    }

    private List<Double> toDouble(List<String> tokens) {
        List<Double> numbers = new ArrayList<>();

        for (String token : tokens) {
            if (token == null) {
                throw new IllegalArgumentException("Null token encountered");
            }
            String s = token.trim();
            if (s.isEmpty()) {
                continue;
            }
            double value;
            try {
                value = Double.parseDouble(s);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("올바르지 않은 입력 : " + s, e);
            }
            if (!Double.isFinite(value)) {
                throw new IllegalArgumentException("유한하지 않은 숫자" + s);
            }
            numbers.add(value);
        }
        return numbers;
    }
}
