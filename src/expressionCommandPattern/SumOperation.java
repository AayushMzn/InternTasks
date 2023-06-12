package expressionCommandPattern;

import commandPattern.Request;

public class SumOperation implements Operation {
    private OperationRequest operationRequest;
    private int a,b;

    public SumOperation(OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
        a=operationRequest.a;
    }

    public int execute() {
       return operationRequest.sum(a,b);
    }

}
