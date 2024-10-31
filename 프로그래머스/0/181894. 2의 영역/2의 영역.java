import java.util.*;

class Solution {
    public int[] solution(int[] arr) {        
        List<Integer> list = new ArrayList<>();

        // indexOf를 쓰기 위해 int 배열을 Integer 배열로 바꿈
        Integer[] intList = Arrays.stream(arr)
            .boxed()
            .toArray(Integer[]::new);
        
        int firstIdx = Arrays.asList(intList).indexOf(2);
        int lastIdx = Arrays.asList(intList).lastIndexOf(2);
        
        if (firstIdx == -1) {
            return new int[] {-1};
        }
        
        for (int i = firstIdx; i <= lastIdx; i++) {
            list.add(arr[i]);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
