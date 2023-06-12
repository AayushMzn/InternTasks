

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */


public class Main {
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] typeCount = new int[5];

        for(int i : arr){
            if(i==1){
                typeCount[0]+=1;
            }else if(i==2){
                typeCount[1]+=1;
            }else if(i==3){
                typeCount[2]+=1;
            }else if(i==4){
                typeCount[3]+=1;
            }else{
                typeCount[4]+=1;
            }
        }

        int max=typeCount[0];
        int res = 1;
        for(int i = 1;i<5;i++){
            if(max<typeCount[i]){
                max = typeCount[i];
                res = i+1;
            }
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
//        Singleton singletonObject = Singleton.getSObj();
//        singletonObject.message();
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(4);
        arr.add(5);
        arr.add(5);
        arr.add(5);
        arr.add(3);
            arr.isEmpty();
        System.out.println( migratoryBirds(arr));
    }
}





