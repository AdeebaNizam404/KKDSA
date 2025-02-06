package Recursion.EasyQuestions;

public class ReverseNum {
    public static void main(String[] args) {
        System.out.println(rev1(123));
        System.out.println(ispalin(1231));
        
    }
    static int sum=0;
    static int rev1(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        sum=sum*10+rem;
        rev1(n/10);
        return sum;
    }
    public static boolean ispalin(int n){
        return n==rev1(n);
    }

}
