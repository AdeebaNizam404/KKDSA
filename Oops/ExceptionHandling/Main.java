package Oops.ExceptionHandling;

public class Main {
    public static void main(String[] args){
        int a =5;
        int b=0;
        try{
          //divide(a,b);
           String name = "Adeeba";
           if(name.equals("Adeeba")){
            throw new MyException("Name is Adeeba");
           }
        }
        catch(MyException e){
            System.out.println(e.getMessage());

        }
        catch(Exception e){
            System.out.println("NormalException");

        }
        finally{
            System.out.println("This will always execute");
        }
    }
        static int divide(int a,int b) throws ArithmeticException{
            if(b==0){
                throw new ArithmeticException("Please donot divide by zero");
            }
            return a/b;
        }
    
}
