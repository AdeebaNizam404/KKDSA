package Oops.Access;

public class ObjectDemo {
    int num;
    public ObjectDemo(int num){
        this.num=num;
    }
    //details in hashmap
    @Override
    public int hashCode(){
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString(){
        return super.toString();
    
    }
    @Override
    protected void finalize() throws Throwable{
       // super.finalize();
    }
}
