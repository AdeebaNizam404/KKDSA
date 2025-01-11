package Arrays.ArraysQuestions;

import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(5);
          list.add(94);
          list.add(34);
          list.add(344);
          list.add(39);
          list.add(60);
          list.add(345);
          list.add(45);
          list.add(20);
          list.add(78);
          list.add(2345);
          System.out.println(list.contains(345));
          System.out.println(list);
          list.remove(7);
          System.out.println(list);
    }
}
