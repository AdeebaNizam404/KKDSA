import java.util.Scanner;
public class PowerOfTwo {
   public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int k=0;
    while(n>0){
        int d=n&(n-1);
        k= k+d;
        n=n>>1;
    }
      if(k==0){
      System.out.println("True");
      }
      else{
        System.out.println("False");
      }
      in.close();
     
    }
   } 

