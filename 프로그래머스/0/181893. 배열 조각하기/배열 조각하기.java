import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        // 배열을 계속 업데이트하면 효율이 떨어질 수 있으므로
        // 리스트로 변환하여 작업
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        for (int i = 0; i < query.length; i++) {
            int idx = query[i];
            if (i % 2 == 0) {
                list = list.subList(0, idx + 1);
            } else {
                list = list.subList(idx, list.size());
            }
        }
        
        int[] answer = list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
        return answer;
    }
}