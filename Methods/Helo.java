package Methods;

public class Helo {
    public static void main(String[] args) {
        System.out.println(sqAdd(82));
    }
    static int sqAdd(int r){
        int m=0;
        while(r>0){
            int d=r%10;
            m=m+d*d;
            r=r/10;
        
        }
    return m;
}
}
