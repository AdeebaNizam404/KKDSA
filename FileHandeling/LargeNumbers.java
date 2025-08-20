package FileHandeling;

import java.math.BigInteger;

public class LargeNumbers {
    public static void main(String[] args) {
     int a = 30;
     int b = 40;
     BigInteger A = BigInteger.valueOf(33);
     BigInteger B = BigInteger.valueOf(3984567);//convert int/long to BI
     BigInteger C =  new BigInteger("398123483274987897587378347567");
     BigInteger X =  new BigInteger("398123478347567");
     int c = B.intValue();//convert BI to int 
     BigInteger D = BigInteger.TEN;
     BigInteger s = A.add(B);
     BigInteger sum = C.add(X);
     BigInteger mul = C.multiply(X);
     BigInteger div = C.divide(X);
     BigInteger rem = C.remainder(X);
     System.out.println(s);
     System.out.println(sum);
     System.out.println(mul);
     System.out.println(div);
     if(X.compareTo(C)<0){
        System.out.println("Yes");
     }
    }
}
