package Strings;

import java.util.Arrays;

public class StringMethode {
    public static void main(String[] args) {
        String name="Adeeba Nizam Helo World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(" Adeeba ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
    
}
