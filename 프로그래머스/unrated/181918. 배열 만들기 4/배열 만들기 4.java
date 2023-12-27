import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        ArrayList<Integer> arrList = new ArrayList<>();
        int i = 0;
        
        while (i < arr.length) {
            if (arrList.size() == 0) {
                arrList.add(arr[i]);
                i += 1;
            } else if (arrList.size() != 0 && arrList.get(arrList.size() -1) < arr[i]) {
                arrList.add(arr[i]);
                i += 1;
            } else {
                arrList.remove(arrList.size() -1);
            } 
        }
            
        int[] stk = arrList.stream()
            .mapToInt(Integer :: intValue)
            .toArray();
        
        return stk;
    }
}