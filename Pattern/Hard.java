package Pattern;

public class Hard {
    public static void main(String[] args){
        pattern1(5);
        System.out.println();
        pattern2(5);
        System.out.println();
        pattern3(5);
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int space=0;space<n-i;space++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
        for(int j=2;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();

        }
    }
    static void pattern2(int m){
        for(int i=1;i<=2*m;i++){
            int c=i>m?2*m-i:i;
            for(int space=0;space<m-c;space++){
                System.out.print("  ");
            }
            for(int j=c;j>=1;j--){
                System.out.print(j+" ");
            }
        for(int j=2;j<=c;j++){
            System.out.print(j+" ");
        }
        System.out.println();

        }
        }
        static void pattern3(int r){
            r=2*r;
         for(int i=0;i<=r;i++){
            for(int j=0;j<=r;j++){
          int everyIndex=Math.min(Math.min(i,j),Math.min(r-i,r-j));
          System.out.print(everyIndex+" ");
            }
            System.out.println();
         }
        }
    }

