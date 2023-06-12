package charArrayProblem;


import java.util.ArrayList;
import java.util.HashMap;

public class StringPoolGarbage {
    static char[] pool = new char[1024];
    static int[] garbage = new int[100];
    static HashMap<String, Integer> reference = new HashMap<>();
    static int lastIndex = 1;
    static int garbageIndex = 0;

    static int put(char[] value) {
        for (int i = 0; i < value.length; i++) {
            pool[lastIndex] = value[i];
            lastIndex++;
        }
        pool[lastIndex] = '0';
        lastIndex++;
        return (lastIndex - value.length) - 1;
    }

    static String get(int index) {
        StringBuilder result = new StringBuilder();
        for (int i = index; pool[i] != '0'; i++) {
            result.append(pool[i]);
        }
        return result.toString();
    }

    private static void delete(int index) {
        garbage[garbageIndex] = index;
        garbageIndex++;
    }

    static void garbageCollector() {
        int i = 512, x = 1;

            for (int j : garbage) {
                if (j == 0) {
                    break;
                }
                if (!reference.containsValue(j)) {
                    String name = "";
                    while (pool[x] != '0') {
                        pool[i] = pool[x];
                        name += pool[x];
                        x++;
                        i++;
                    }
                    System.out.println(name);
                    pool[i] = '0';
                    i++;
                    reference.replace(name, (x - name.length()) - 1, (i - name.length()) - 1);

                }
            }
        lastIndex = 1;
        garbageIndex = 0;
    }

    public static void main(String[] args) {

        reference.put("amar", put("amar".toCharArray()));
        reference.put("ujjwal", put("ujjwal".toCharArray()));
//        System.out.println(get(reference.get("ujjwal")));
//        System.out.println(get(reference.get("bishal")));
        System.out.println(pool);
//        System.out.println(reference.size());
        delete(reference.get("amar"));
//        for (int j : garbage) {
//            if(j==0){
//                break;
//            }
//            System.out.println(j);
//        }
//        System.out.println(get(reference.get("ujjwal")));


        reference.put("bishal", put("bishal".toCharArray()));
//        System.out.println(get(reference.get("amar")));

        garbageCollector();


        reference.put("samrat", put("samrat".toCharArray()));
        System.out.println(reference.get("samrat"));
        System.out.println(pool);

        for (int i = 512; i < 1024; i++) {
            System.out.print(pool[i]);
        }
//        System.out.println("\n"+get(reference.get("samrat")));
//        System.out.println(get(reference.get("bishal")));
//        System.out.println(get(reference.get("amar")));

    }

}