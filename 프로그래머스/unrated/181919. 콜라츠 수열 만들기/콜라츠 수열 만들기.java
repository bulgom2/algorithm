import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        arrList.add(n);
        
        while(n != 1) {
            
            if (n % 2 == 0) {
                n = n / 2;
                arrList.add(n);
            } else {
                n = 3 * n + 1;
                arrList.add(n);
            }
        }
        
        int[] answer = arrList.stream()
            .mapToInt(Integer :: intValue)
            .toArray();
        
        return answer;
    }
}