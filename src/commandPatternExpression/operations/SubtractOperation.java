package commandPatternExpression.operations;

import commandPatternExpression.command.Command;

public class SubtractOperation implements Command {

    public int execute(int num1, int num2){
        return num1-num2;
    }

    @Override
    public char getKey() {
        return '-';
    }
}