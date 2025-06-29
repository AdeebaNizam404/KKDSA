package Oops.StaticExample;

public class Main {
    @SuppressWarnings("unused")
    public static void main(String[] args){
        Human adeeba = new Human(20,"Adeeba",50000,false);
        Human riya = new Human(20,"Riya",80000,false);
        System.out.println(adeeba.name);
        System.out.println(Human.population);
        System.out.println(Human.population);
        fun();
        Main funn= new Main();
       funn.fun2();
    }
     
    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }
   void fun2(){
      greeting();
    }
    void greeting(){
        System.out.println("Hello!!");
    }
    Singleton obj = Singleton.getInstance();
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();
    //All the reference variable are pointin to just one object
}
