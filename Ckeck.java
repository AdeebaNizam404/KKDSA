// import java.util.Scanner;
public class Ckeck {
    public static void main(String[] args) {
      String str1="wel";
      String str2="elc";
      System.out.println(str1.compareTo(str2));
      System.out.println(LCM(6,8));
   //      Scanner in = new Scanner(System.in);
   //   int[] arr= new int[5];
   //   int max=0;
   //   for(int i=0;i<arr.length;i++){
   //      arr[i]=in.nextInt();
   //   }
   //   for(int i=0;i<arr.length;i++){
   //      if(arr[i]>max){
   //          max=arr[i];
   //      }
   //   }
   //   System.out.println("maximum:"+max);
   //  in.close();
// -----------------------------------------------------
//     char ch = 'a'+1;
//  System.out.println(ch);
//     int c = (int)ch;
//  System.out.println(c);
     }
  static int LCM(int a, int b){
int max = Math.max(a, b);

while(true){
   if(max%a==0&&max%b==0){
     return max;
   }
 max++;
  }
}
}
