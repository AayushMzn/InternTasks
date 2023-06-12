package typeCastingExamples;

import java.util.ArrayList;
import java.util.List;

public class TypeCast {
    public static void main(String[] args) {
        List<Integer> grades =new ArrayList<>();
        grades.add(73);
        grades.add(40);
        grades.add(33);
        grades.add(81);
        List<Integer> arr = new ArrayList<>();
        for(int i : grades){
            if(i%5==0 || i<40){
                arr.add(i);
            }else{
                int j = (i/5 +1)*5;
                if((j-i)<3){
                    arr.add(j);
                }
                else{
                    arr.add(i);
                }
            }
        }
        System.out.println(arr);
    }
}
