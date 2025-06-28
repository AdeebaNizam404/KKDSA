package Oops.Properties.Polymorphism;

public class Numbers {
    double add(int a,int b){
        return a-b;
    }
    double add(double a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Numbers obj = new Numbers();
      System.out.println(obj. add(10.0,2));
      
    }
    
}
