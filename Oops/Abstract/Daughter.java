package Oops.Abstract;

public  class Daughter extends Parent {
 public Daughter(int age){
    this.age=age;
 }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void Partner() {
        System.out.println("I love IronMan");
    }
    
}


