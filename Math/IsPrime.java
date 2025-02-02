public class IsPrime {
    public static void main(String[] args){
        int n=20;
        for(int i=1;i<=n;i++){
            System.out.println(i+"is "+checkPrime(i));
        }

    }
    static boolean checkPrime(int r){
        if(r==1){
            return false;
        }
        int c=2;
         while(c*c<=r){
          if(r%c==0){
           return false;
          }
          c++;
         }
         return true;
    }
  
}
