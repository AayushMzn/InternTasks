package charArrayProblem;

public class StringPool {
    static char[] pool = new char[1024];
//    static int lastIndex = 0;

    static int[] put(char[] value) {
        int lastIndex = 0;
        for(char c : pool){
            if(c == '\0'){
                break;
            }
            lastIndex++;
        }
        for (char c : value) {
            pool[lastIndex] = c;
            lastIndex++;
        }
        return new int[]{lastIndex - value.length, lastIndex};
    }

    static char[] get(int[] index) {
        int indexStart = index[0];
        int indexEnd = index[1];

        char[] result = new char[indexEnd - indexStart];
        int x = 0;
        for (int i = indexStart; i < indexEnd; i++) {
            result[x] = pool[i];
            x++;
        }
        return result;
    }

//    static void delete(int[] index) {
//        int indexStart = index[0];
//        int indexEnd = index[1];
//
//        char[] fromSurvivor = new char[lastIndex - (indexEnd - indexStart)];
//        int x = 0;
//        for (int i = 0; i < lastIndex; i++) {
//            if (i >= indexStart && i < indexEnd) {
//                continue;
//            }
//            fromSurvivor[x] = pool[i];
//            x++;
//        }
//        for (int i = 0; i < x; i++) {
//            pool[i] = fromSurvivor[i];
//        }
//
//        lastIndex = x;
//    }

    public static void main(String[] args) {

        int[] ujjwalRef = put("ujjwal".toCharArray());
        int[] anishRef = put("anish".toCharArray());

        System.out.println(get(ujjwalRef));
        System.out.println(get(anishRef));
//        System.out.println(pool);
//
//        delete(ujjwalRef);
//        System.out.println(pool);
//
//        int[] amarRef = put("amar".toCharArray());
////        System.out.println(get(amarRef));
//        System.out.println(pool);
//        int[] samratRef = put("samrat".toCharArray());
//        System.out.println(pool);
    }
}
