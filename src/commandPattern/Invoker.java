package commandPattern;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Operation> commandList = new ArrayList<Operation>();

    public void takeRequest(Operation command){
        commandList.add(command);
    }

    public void placeRequest(){

        for (Operation command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
