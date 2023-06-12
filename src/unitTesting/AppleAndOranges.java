package unitTesting;

import java.util.List;

public class AppleAndOranges {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int houseApple = 0, houseOrange = 0;
        for(int app: apples){
            if((app + a) >= s && (app + a) <= t){
                houseApple++;
            }
        }
        for (int org : oranges) {
            if((org + b) >= s && (org + b) <= t){
                houseOrange++;
            }
        }
        System.out.println(houseApple);
        System.out.println(houseOrange);
    }

    public static void main(String[] args) {
//        countApplesAndOranges(7 ,11,5,15,[-2,2,1],[5,-6]);
    }
}


