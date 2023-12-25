import java.util.*;

class Solution {
    public int[] solution(int start_num, int end_num) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = start_num; i < end_num + 1; i++) {
            arrList.add(i);
        }
        
        int[] arr = arrList.stream()
            .mapToInt(Integer :: intValue)
            .toArray();
        
        return arr;
    }
}