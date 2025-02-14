package Strings.StringRecursion;

public class SkipWord {
    public static void main(String[] args) {
        System.out.println(apple("adappleeeba"));
        System.out.println(appnotapple("adappeeba"));
    }
    static String  apple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return apple(up.substring(5));
        }
        else{
            return up.charAt(0)+apple(up.substring(1));
        }
    }
    static String appnotapple(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")&& ! up.startsWith("apple")){
            return appnotapple(up.substring(3));
        }
        else{
            return up.charAt(0)+appnotapple(up.substring(1));
        }
    }
}
