import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        List<Integer> evenArr = new ArrayList<>();
        List<Integer> oddArr = new ArrayList<>();
        
        for (int i = 0; i < num_list.length; i++) {
            if (i % 2 == 0) {
                evenArr.add(num_list[i]);
            } else {
                oddArr.add(num_list[i]);
            }
        }
        
        int even = 0;
        int odd = 0;
        
        for (int i : evenArr) {
            even += i;
        }
        
        for (int i : oddArr) {
            odd += i;
        }
        
        if (even > odd) {
            answer = even;
        } else if (even < odd) {
            answer = odd;
        } else {
            answer = even;
        }
        
        return answer;
    }
}