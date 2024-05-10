import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String letter = my_string.substring(s, e + 1);
        String reversed = "";
        int len = letter.length();

        for (int i = len - 1; i >= 0; i--) {
            reversed += letter.charAt(i);
        }
        
        String str1 = my_string.substring(0, s);
        String str2 = my_string.substring(e + 1);

        answer = str1 + reversed + str2;
        
        return answer;
    }
}