import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        List<String> arr = new ArrayList<>();
        
        if (names.length <= 5) {
            arr.add(names[0]);
        } else {
            arr.add(names[0]);
            for (int i = 1; i < names.length; i++) {
                if (i % 5 == 0) {
                    arr.add(names[i]);
                }
            }
        }
        
        String[] answer = arr.toArray(String[]::new);
        
        return answer;
    }
}