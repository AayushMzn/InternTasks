package commandPattern;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Request request = new Request();

        ConcreteCommandOpen buyStockOrder = new ConcreteCommandOpen(request);
        ConcreteCommandSave sellStockOrder = new ConcreteCommandSave(request);

        Invoker invoker = new Invoker();
        invoker.takeRequest(buyStockOrder);
        invoker.takeRequest(sellStockOrder);

        invoker.placeRequest();
    }
}
