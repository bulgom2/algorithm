import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {

        // 기존 배열 업데이트 방법
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                // 짝수 인덱스에서는 query[i] 이후의 요소들을 잘라냄
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else {
                // 홀수 인덱스에서는 query[i] 이전의 요소들을 잘라냄
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        return arr;

        // 리스트로 변환하여 푸는 방법
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
