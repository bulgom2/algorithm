import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        
        List<Integer> nums = new ArrayList<>();
        
        for (int i = 0; i < intStrs.length; i++) {
            int num = Integer.parseInt(intStrs[i].substring(s, s + l));

            if (num > k) {
                nums.add(num);
            }
        }
        
        int size = 0;
        int[] answer = new int[nums.size()];
        
        for (int temp : nums) {
            answer[size++] = temp;
        }
        
        return answer;
    }
}