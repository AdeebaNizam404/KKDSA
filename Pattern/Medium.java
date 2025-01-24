package Pattern;

public class Medium {
    public static void main(String[] args){
        pattern1(5);
        System.out.println();
        pattern2(5);
    }
    static void pattern1(int n){
     for(int i=1;i<(2*n);i++){
        int count=i>n?2*n-i:i;
        for(int j=1;j<count;j++){
            System.out.print(" * ");
        }
        System.err.println();
     }
    }
static void pattern2(int m){
    for (int i = 1; i <2*m; i++) {
     int count=i>m?2*m-i:i;
     int noOfSpaces=m-count;
     for(int s=0;s<noOfSpaces;s++){
        System.out.print(' ');
     }

     for(int j=0;j<count;j++){
      System.out.print("* ");
     }
     System.out.println();
    }
}
    
}
