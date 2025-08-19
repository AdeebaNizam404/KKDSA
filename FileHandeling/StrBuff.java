package FileHandeling;
import java.text.DecimalFormat;
import java.util.Arrays;
public class StrBuff {
    public static void main(String[] args) {
        //constructor1
        StringBuffer sb = new StringBuffer();
    System.out.println(sb.capacity());
       //constructor 2
       StringBuffer sb1 = new StringBuffer("Adeeba Nizam");
       //constructor3
        StringBuffer sb2 = new StringBuffer(30);
    System.out.println(sb2.capacity());
     sb.append("WeMakeDevs");
     sb.append(" is nice!");

     sb.insert(2, " Aysha ");
     System.out.println(sb);

    sb.replace(1, 5, "Nizam");

    sb.delete(1, 5);

    // sb.reverse();

    String str = sb.toString();
    System.out.println(str);
     String arr = "Adeeba,Kunal,Rahul,Snehal";
    String[] names = arr.split(",");
    System.out.println(Arrays.toString(names));

    // rounding off
    DecimalFormat df = new DecimalFormat("00.0000");
    System.out.println(df.format(7.29));
    }
    
}
