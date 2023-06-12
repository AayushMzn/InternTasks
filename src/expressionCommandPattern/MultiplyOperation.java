package expressionCommandPattern;

public class MultiplyOperation implements Operation{
    private OperationRequest operationRequest;

    public MultiplyOperation(OperationRequest operationRequest) {
        this.operationRequest = operationRequest;
    }

    public void execute() {
        operationRequest.multiply();
    }

}
