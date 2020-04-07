package mytech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RiverRecordHackerRank1 {

    public static void main(String[] args) {


                List<Integer> levels = Arrays.asList(new Integer[]{5,3,6,7,4});
                System.out.println(levels.size());
                System.out.println(maxTrailing(levels));
    }

    private static int maxTrailing(List<Integer> levels) {
        int max =0;
        for(int k=0;k<levels.size()-1;k++){
            for(int i=k-1;i>=0;i--) {
                if (levels.get(k) > levels.get(i)) {
                    int diff = levels.get(k) - levels.get(i);
                    System.out.println("Current Max = " + max + " : " + levels.get(i) + " - " + levels.get(k) + " = " + diff);
                    if (diff > max) {
                        max = diff;
                    }
                }
            }
        }
        return max;
    }
}
