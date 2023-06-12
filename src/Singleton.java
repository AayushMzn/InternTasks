public class Singleton {
    private static Singleton singletonObject = new Singleton();

    public static Singleton getSObj() {
        return singletonObject;
    }

    public void message(){
        System.out.println("singleton");
    }
}
