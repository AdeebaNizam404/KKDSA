package ImportantQuestion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        sumeqTarget("", 4);
        System.out.println(sumTargetList("", 4));
    }

    static void sumeqTarget(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            sumeqTarget(p + i, target - i);
        }
    }

    static ArrayList<String> sumTargetList(String p, int target) {
        ArrayList<String> list = new ArrayList<>();
        if (target == 0) {
       list.add(p);
            return list;
        }for(int i=1;i<=6&&i<=target;i++){
            list.addAll(sumTargetList(p+i, target-i)) ;
         
        }
        return list;     
          
    }
}
 