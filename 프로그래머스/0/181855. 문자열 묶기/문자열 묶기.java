import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (String str : strArr) {
            if (map.get(str.length()) == null) {
                map.put(str.length(), 1);
            } else {
                map.put(str.length(), map.get(str.length()) + 1);
            }
        }
        
        for (Integer key : map.keySet()) {
            if (answer < map.get(key)) {
                answer = map.get(key);
            }
        }
        
        return answer;
    }
}