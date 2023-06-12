package unitTesting;

public class Kangaroo {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        while (true) {
            if (x1 == x2) {
                return "YES";
            }
            x1 += v1;
            x2 += v2;
            if (x1 > x2) {
                return "NO";
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(kangaroo(1, 2, 2, 2));
    }
}
