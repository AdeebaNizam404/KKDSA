package Oops.Generics;
import java.util.ArrayList;
import java.util.function.Consumer;
public class LambdaFunctions {
    public static void main(String[] args){
   ArrayList<Integer> arr = new ArrayList<>();
   for (int i = 0; i < 5; i++) {
    arr.add(i+1);
   }
  // arr.forEach((items)->System.out.println(items*2));
   Consumer<Integer> fun = (items)->System.out.println(items*2);
   arr.forEach(fun);
   Operation sum = (a,b)->a+b;
   Operation dif = (a,b)->a-b;
   Operation pro = (a,b)->a*b;
   LambdaFunctions myCalculator = new LambdaFunctions();
   System.out.println(myCalculator.Operation(5,3,sum));
   System.out.println(myCalculator.Operation(5,3,dif));
   System.out.println(myCalculator.Operation(5,3,pro));
    }
    private int Operation(int a, int b, Operation op) {
    return op.operation(a,b);   
    }
    int sum(int a,int b){
        return a+b;
    }
    public interface Operation {
        int operation(int a,int b);
    
        
    }
}
