package FileHandeling;
import java.util.Random;
public class RandomString {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) {
        int n =20;
        String name =RandomString.generate(n);
        System.out.println(name);
    }
    static String generate(int size){
       Random random = new Random();
       for (int i = 0; i < size; i++) {
        int randomchar = 97 +(int)(random.nextFloat()*26);
        sb.append((char)randomchar);
       }
    return sb.toString();
    }
}
