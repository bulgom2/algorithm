import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        // 학생 리스트: 참석 학생의 인덱스 수집
        List<Integer> sList = new ArrayList<>();
        // <등수:학생>으로 담긴 Map 생성
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        // 참석여부 배열에서 true인 경우 해당 인덱스를 학생 리스트에 추가
        for (int i = 0; i < attendance.length; i++) {
            if (attendance[i] == true) {
                sList.add(i);
            }
        }
        
        // key: 등수, value: 학생번호
        for (int i = 0; i < sList.size(); i++) {
            map.put(rank[sList.get(i)], sList.get(i));
        }
        
        // 키(등수)가 담긴 리스트를 생성하여 등수 기준 오름차순 정렬
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);
        
        // 상위 3명 추출을 위해 map에서 등수로 정렬된 학생 번호 대입
        int first = map.get(keySet.get(0));
        int second = map.get(keySet.get(1));
        int third = map.get(keySet.get(2));
        
        return 10000 * first + 100 * second + third;
    }
}