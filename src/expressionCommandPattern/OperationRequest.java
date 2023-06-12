package expressionCommandPattern;

import java.util.Stack;

public class OperationRequest {
    String exp1 = "{(1+1)+(1+1)}";


    public int sum(int a, int b){
       return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }

}
