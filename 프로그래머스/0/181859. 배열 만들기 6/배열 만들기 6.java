import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i += 1;
            } else if (!stk.isEmpty() && stk.peek() == arr[i]) {
                stk.pop();
                i += 1;
            } else if (!stk.isEmpty() && stk.peek() != arr[i]) {
                stk.add(arr[i]);
                i += 1;
            }
        }
        
        if (stk.isEmpty()) {
            stk.add(-1);
        }
        
        int[] answer = stk.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}