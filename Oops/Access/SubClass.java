package Oops.Access;

public class SubClass extends A {


    public SubClass(int num,String name){   super(num,name);}
    public static void main(String[] args){
        A obj = new A(45,"adeeba Nizam");
    }
}
class SubSubClass extends SubClass{
    public SubSubClass(int num,String name)
    {   super(num,name);
        
    }
    public static void main(String[] args){
        A obj = new A(45,"adeeba Nizam");
        int num = obj.num;
    }

}
class SubClass2 extends A{

    public SubClass2(int num,String name){
        super(num,name);
    }
   public static void main(String[] args){
    A obj =new A(45,"Adeeba nizam");
   }

}
        
    
    
