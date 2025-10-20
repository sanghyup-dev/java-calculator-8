package calculator;


import camp.nextstep.edu.missionutils.Console;

public class ConsoleRunner {

    private final StringPlusCalculator stringPlusCalculator;

    public ConsoleRunner(StringPlusCalculator stringPlusCalculator) {
        this.stringPlusCalculator = stringPlusCalculator;
    }

    public void run() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        String input = Console.readLine();
        double result = stringPlusCalculator.add(input);
        printResult(result);
    }

    private void printResult(double result) {
        System.out.print("결과 : ");
        if (Double.isInfinite(result)) {
            System.out.println(result);
        } else {
            System.out.println((int) result);
        }
    }
}
