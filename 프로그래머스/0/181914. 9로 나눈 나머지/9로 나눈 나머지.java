import java.lang.*;
import java.util.*;

class Solution {
    public int solution(String number) {
        int num = 0;
        String[] arr = number.split("");
        int[] nums = Arrays.stream(arr)
            .mapToInt(Integer :: parseInt)
            .toArray();
        
        for (int i = 0; i < nums.length; i++) {
            num += nums[i];
        }
        
        return num % 9;
    }
}