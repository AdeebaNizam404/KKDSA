public class NoOfSetBinary {
    public static void main(String[] args){
        int n=48;
        System.out.println(Integer.toBinaryString(n));
    
    int count=0;
    while(n>0){
        count++;
        n=n&(n-1);
    }
    System.out.println(count);
}
    
}
