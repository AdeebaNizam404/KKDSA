package Oops.Abstract;

public class  Son  extends Parent {
 public Son(int age){
    this.age=age;
 }
    @Override
    void career() {
        System.out.println("I am going to be a doctor ");
    }

    @Override
    void Partner() {
        System.out.println("I love Barbie");
    }
    
}
