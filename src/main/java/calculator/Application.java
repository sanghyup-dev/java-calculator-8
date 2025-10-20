package calculator;

public class Application {
    public static void main(String[] args) {

        InputParser inputParser = new InputParser();
        StringPlusCalculator stringPlusCalculator = new StringPlusCalculator(inputParser);
        ConsoleRunner consoleRunner = new ConsoleRunner(stringPlusCalculator);

        consoleRunner.run();
    }
}
