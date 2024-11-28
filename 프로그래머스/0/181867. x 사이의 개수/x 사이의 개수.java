import java.util.*;

class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        String[] arr = myString.split("x");
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i].length());
        }
        
        if (myString.charAt(myString.length() - 1) == 'x') {
            list.add(0);
        }
        
        answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}