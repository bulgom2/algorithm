import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        List<String> list = new ArrayList<>();
        String[][] arr = new String[my_string.length() / m][m];
        char letter;
        
        for (int i = 0; i < my_string.length(); i++) {
            letter = my_string.charAt(i);
            list.add(Character.toString(letter));
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = list.get(0);
                list.remove(0);
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i][c-1];
        }
        
        return answer;
    }
}