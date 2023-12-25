import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {-1};
        
        ArrayList<Integer> arr = new ArrayList<>();
        int count1 = 0;
        
        for (int i = l; i < r + 1; i++) {
            String str = String.valueOf(i);
            int count2 = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '0' || str.charAt(j) == '5') {
                    count2++;
                }
            }
            if (count2 == str.length()) {
                count1++;
                arr.add(i);
            }
        }
        
        if (count1 == 0) {
            return answer;
        }
        
        int[] arr2 = arr.stream()
            .mapToInt(Integer :: intValue)
            .toArray();
        
        return arr2;
    }
}