package Hashmap;
import java.util.*;
public class Hash {
    public static void main(String[] args) {

         //country (KEY)  population (vaLUE)
         HashMap<String , Integer> map = new HashMap<>();
          map.put("India" , 120);
          map.put("US" , 30);
          map.put("China" , 150);
          System.out.println(map);
          map.put("China",140);
          System.out.println(map);

        //searching
        if(map.containsKey("china")){
             System.out.println("Present");
         } 
        System.out.println(map.get("china"));
        System.out.println(map.get("Indonesia"));

        //iteration
        for(Map.Entry<String ,Integer> e : map.entrySet()){
            System.out.print(e.getKey()+"  ");
            System.out.println(e.getValue());
        }
        map.remove("china");
        System.out.println(map);

        }
}
