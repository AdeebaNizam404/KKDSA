package Oops.Properties.Inheritance;

public class BoxCost extends BoxWeight {
    double cost ;
    BoxCost(){
        super();
        this.cost=-1;
    }
    BoxCost(BoxCost other){
        super(other);
        this.cost = other.cost;
    
    }
    BoxCost(double l,double w,double h,double wid,double cost){
        super(l,w,h,wid);
        this.cost = cost;
    }
}
