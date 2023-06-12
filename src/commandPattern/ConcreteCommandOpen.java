package commandPattern;

public class ConcreteCommandOpen implements Operation {
    private Request request;

    public ConcreteCommandOpen(Request request){
        this.request = request;
    }

    public void execute() {
        request.open();
    }
}
