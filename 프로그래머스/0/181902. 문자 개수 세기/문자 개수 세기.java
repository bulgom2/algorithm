class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        // my_string의 글자 길이만큼 순회
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);
            
            // 대문자인 경우, 해당 알파벳의 아스키코드에서 A를 뺀 인덱스를 카운트함
            if (ch >= 'A' && ch <= 'Z') {
                answer[ch - 'A']++;
            } else if (ch >= 'a' && ch <= 'z') {
                answer[ch - 'a' + 26]++;
            }
        }
        
        return answer;
    }
}