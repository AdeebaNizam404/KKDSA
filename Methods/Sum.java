package Methods;
import java .util.Scanner;
public class Sum {
   
    public static void main(String args[]){
       
      int add =  sum();
      System.out.println("Sum without Parameters "+add);
      int add2  = sum1(30,50);
      System.out.println("Sum with Parameters "+add2);

    }
    //With parameters
    static int  sum1(int a,int b){
       
       int sum1 = a+b;
      return sum1;
    }
    //Without Paremeters
     static int sum(){
        try (Scanner in = new Scanner(System.in)) {
          System.out.println("Enter number first:");
           int a = in.nextInt();
           System.out.println("Enter number Second:");
           int b = in.nextInt();
           int sum = a+b;
           
          return sum;
        }
    }
    }

