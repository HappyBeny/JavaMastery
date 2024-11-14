package thirdHomework;

public class Calculator {
    AbstractOperation operation;


    public Calculator(AbstractOperation operator) {
        this.operation = operator;
    }

    public double calculate(int firNum, int secNum){
        return operation.operate(firNum, secNum);
    }
}
