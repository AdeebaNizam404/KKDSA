class Solution {
    public static void main(String[] args) {
        
    }
    public String truncateSentence(String s, int k) {
        int count =0;
        String str ="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            str+=ch;
            if(ch==' '){
                count++;
            }

           if(count == k){
            break;
           }

        }
        return str;
    }
}