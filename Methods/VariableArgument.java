package Methods;
import java .util.Arrays;
public class VariableArgument {
    public static void main(String[] args){
        fun(1,3,"Adeeba","Ayaan","Tooba","Danishal");
    }
    static void fun( int a,int b ,String  ...v){
      System.out.println(Arrays.toString( v));
    }
    
}
