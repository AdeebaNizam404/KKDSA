package Oops.Properties.Inheritance;

public class BoxWeight extends Box{
    double weight;
     public BoxWeight(){
        this.weight = -0.1;
    }
    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight;
    }
    BoxWeight(double wid){
        this.weight = wid;
    }
   public BoxWeight(double l,double h,double w , double wid){
        super(l,h,w);
        this.weight = wid;
    }
}
