package Pattern;
import java.util.Scanner;
public class Easy {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        pattern1(5);
        System.out.println();
        pattern3(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern4(5);
        in.close();
    }
    static void pattern1(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
    }
    static void pattern2(int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                System.out.print(" * ");
            }
            System.out.println();
        } 
    }
    static void pattern3(int m){
        for(int i=m;i>=0;i--){
            for(int j=0;j<i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    static void pattern4(int s){
        for(int i=1;i<=s;i++){
            
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
     

}
