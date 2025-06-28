package Oops;

public class OopsMain {
    public static void main(String[] args){

    }
}
    class Student{
        int rno;
        String name;
        float marks;
        void greeting(){
            System.out.println("Helo!! , My name is Adeeba ");
        }
        void changeName(String name){
            this.name=name;
        }
        Student (){
            // this.rno=13;
            // this.name="Adeeba";
            // this.marks=88.5f;
            this(13,"Defaultperson",100.0f);
        }
        Student (int rno, String name, float marks){
            this.rno=rno;
            this.name=name;
            this.marks= marks;
        }
    }

