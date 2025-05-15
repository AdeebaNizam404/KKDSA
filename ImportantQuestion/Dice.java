package ImportantQuestion;

public class Dice {
    public static void main(String[] args){
        sumeqTarget("", 4);
    }

static void sumeqTarget(String p,int target){
if(target==0){
    System.out.println(p);
    return ;
}
for(int i=1;i<=6&&i<=target;i++){
sumeqTarget(p+i, target-i);
}
}
}
