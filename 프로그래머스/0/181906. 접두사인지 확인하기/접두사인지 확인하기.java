import java.util.*;

class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        int len = my_string.length();
        
        for (int i = len; i >= 0; i--) {
            String prefix = my_string.substring(0, i);
            list.add(prefix);
        }
        
        if (list.contains(is_prefix)) {
            answer = 1;
        } else {
            answer = 0;
        }
        
        return answer;
    }
}