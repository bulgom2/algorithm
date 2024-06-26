import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < my_string.length(); i++) {
            String suffix = my_string.substring(i);
            list.add(suffix);
        }
        
        String[] answer = new String[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}