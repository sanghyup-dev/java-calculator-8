package calculator;


import camp.nextstep.edu.missionutils.Console;

public class ConsoleRunner {

    private final StringPlusCalculator stringPlusCalculator;

    public ConsoleRunner(StringPlusCalculator stringPlusCalculator) {
        this.stringPlusCalculator = stringPlusCalculator;
    }

    public void run() {
        String input = Console.readLine();
        double result = stringPlusCalculator.add(input);
    }
}
