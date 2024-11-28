import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        
        String[] arr = myString.split("x");
        List<String> list = new ArrayList<>();
        
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i].isEmpty()) {
                continue;
            } else {
                list.add(arr[i]);
            }  
        }
        
        answer = list.stream().toArray(String[]::new);
        
        Arrays.sort(answer);
        
        return answer;
    }
}