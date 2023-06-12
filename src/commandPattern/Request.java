package commandPattern;

public class Request {
    private String name = "ABC";

    public void save(){
        System.out.println("save :"+name);
    }
    public void open(){
        System.out.println("open :"+name);
    }
}
