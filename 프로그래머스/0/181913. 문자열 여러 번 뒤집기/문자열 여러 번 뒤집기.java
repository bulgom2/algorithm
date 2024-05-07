import java.lang.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            String rev = "";
            
            for (int i = e; i > s - 1; i--) {
                rev += my_string.charAt(i);
            }
            
            String str1 = my_string.substring(0, s);
            String str2 = my_string.substring(e + 1);
            
            my_string = str1 + rev + str2;
        }
        
         return my_string;
    }
}