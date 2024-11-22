import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int cnt = -1;

        while (true) {
            int[] copy = Arrays.copyOf(arr, arr.length);
            
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            cnt++;
            
            if (Arrays.equals(copy, arr)) {
                break;
            }
        }
        
        return cnt;
    }
}