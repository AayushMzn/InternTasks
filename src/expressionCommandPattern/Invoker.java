package expressionCommandPattern;
import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Operation> operationArrayList = new ArrayList<Operation>();

    public void takeRequest(Operation command){
        operationArrayList.add(command);
    }

    public int placeRequest(){
        return 1;
    }
}
