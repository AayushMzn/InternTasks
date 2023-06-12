package arrayListDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Trials {
    public static void main(String[] args) {
        List<Integer> a =new ArrayList<>();
        for(int i = 0; i<10;i++){
            a.add(i);
        }
//        ListIterator<Integer> namesIterator = a.listIterator();
//
//        // Traversing elements using next() method
//        while (namesIterator.hasNext()) {
//            System.out.println(namesIterator.next());
//        }

        System.out.println(a.get(5));
        System.out.println( a.remove(5));
        System.out.println(a.get(5));
    }
}
