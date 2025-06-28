package Oops.Properties.Inheritance;

public class Main {
    public static void main(String[] args){
        Box box1 = new Box(4.4,6.7,34);
        Box box2 = new Box(box1);
        System.out.println(box1.l+" "+box1.w+" "+box1.h);
        System.out.println(box2.l+" "+box2.w+" "+box2.h);
        BoxWeight box3 = new BoxWeight();
        System.out.println(box3.l+" "+box3.weight);
        BoxWeight box4 = new BoxWeight(3,4,5,6);
        System.out.println(box4.l+" "+box4.w+" "+box4.h+" "+box4.weight);
    }
    
}
