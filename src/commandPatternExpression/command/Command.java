package commandPatternExpression.command;

public interface Command {
    int execute(int num1, int num2);

    char getKey();
}
