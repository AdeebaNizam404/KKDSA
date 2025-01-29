public class ArrayCheck {
    public static void main(String[] args){
        int[] arr={1,2,3,1,4,2,3};
        int unique=0;
        for(int n:arr){
            unique=unique^n;
    }
    System.out.println(unique);   
}     
    }  

