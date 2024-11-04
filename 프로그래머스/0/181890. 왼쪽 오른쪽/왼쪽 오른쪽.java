import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        
        int letterL = Arrays.asList(str_list).indexOf("l");
        int letterR = Arrays.asList(str_list).indexOf("r");
        
        // "l"과 "r" 둘 다 없는 경우 빈 배열 반환
        if (letterL == -1 && letterR == -1) {
            return new String[] {};
        }
        
        // "l"이 먼저 나오는 경우, "l"의 왼쪽 부분 반환
        if (letterL != -1 && letterL < letterR || letterR == -1) {
            return Arrays.copyOfRange(str_list, 0, letterL);
        }
        
        // "r"이 먼저 나오는 경우, "r"의 오른쪽 부분 반환
        if (letterR != -1 && letterL > letterR || letterL == -1) {
            return Arrays.copyOfRange(str_list, letterR + 1, str_list.length);
        }
        
        // 기본 반환 빈 배열 (예외 상황)
        return new String[] {};
    }
}