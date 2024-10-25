import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                arrList.add(i);
            }
        }
        
        int arr[] = arrList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return arr;
    }
}