package Oops.Generics;

public class Main {
  public static void main(String[] args){
    Student Adeeba = new Student(8,68.6f);
    Student Riya = new Student(70,88.9f);
    if(Adeeba.compareTo(Riya) <0){
        System.out.println(Adeeba.compareTo(Riya));
       System.out.println("Riya has more marks");
    }
  }  
}
