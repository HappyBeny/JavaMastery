package forthHomework;

import java.util.regex.Pattern;

public class Parser {
    private static final String OPERATION_REG = "[+\\-*/]";
    private static final String NUMBER_REG = "^[0-9]*$";

    private final Calculator calculator = new Calculator();

    public Parser parseFirstNum(String firstInput) throws BadInputException {
        // 구현 1.
        if (Pattern.matches(NUMBER_REG, firstInput)){
            calculator.setFirstNumber(Integer.parseInt(firstInput));
        } else {
            throw new BadInputException("숫자");
        }
        return this;
    }

    public Parser parseSecondNum(String secondInput) throws BadInputException {
        // 구현 1.
        if (Pattern.matches(NUMBER_REG, secondInput)) {
            calculator.setSecondNumber(Integer.parseInt(secondInput));
        } else {
            throw new BadInputException("숫자");
        }
        return this;
    }

    public Parser parseOperator(String operationInput) throws BadInputException {
        // 구현 1.
        if (Pattern.matches(OPERATION_REG, operationInput)) {
            switch (operationInput){
                case ("+"):
                    calculator.setOperation(new AddOperation());
                case ("-"):
                    calculator.setOperation(new SubstractOperation());
                case ("*"):
                    calculator.setOperation(new MultiplyOperation());
                case ("/"):
                    calculator.setOperation(new DivideOperation());
            }
        } else {
            throw new BadInputException("연산자");
        }
        return this;
    }

    public double executeCalculator() {
        return calculator.calculate();
    }
}
