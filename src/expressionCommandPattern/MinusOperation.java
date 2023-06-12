package expressionCommandPattern;

public class MinusOperation implements Operation{
    private OperationRequest operationRequest;

    public MinusOperation(OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }

    public int execute() {
        return operationRequest.subtract();
    }

}
