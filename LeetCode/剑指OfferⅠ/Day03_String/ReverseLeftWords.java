package Day03_String;

public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        //return s.substring(n+1, s.length() + s.substring(0,n));
    	 StringBuilder res = new StringBuilder();
         for(int i = n; i < s.length(); i++) {
             res.append(s.charAt(i));
         }
         for(int i = 0; i < n; i++) {
             res.append(s.charAt(i));
         }
         return res.toString();
    }
}
