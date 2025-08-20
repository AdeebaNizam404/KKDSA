package FileHandeling;
import java.math.BigInteger;
import java.util.Scanner;
public class Factorial {public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
       BigInteger ans = new BigInteger("1");
       for (int i = 2; i < num; i++) {
        ans = ans.multiply(BigInteger.valueOf(i));
       }
       System.out.println(ans);
}
 
   
}
