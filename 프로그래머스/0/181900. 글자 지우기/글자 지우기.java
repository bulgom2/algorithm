class Solution {
    public String solution(String my_string, int[] indices) {
        
        // char 배열에 String 넣어주기
        char[] charArray = my_string.toCharArray(); 
        
        // indices 배열의 요소들을 idx로 가져와서 해당 인덱스의 문자를 '0'으로 치환
        for (int idx : indices) {
            charArray[idx] = '0';
        }

        // char 배열을 String으로 바꾸고 "0"을 모두 지워주기
        String answer = new String(charArray).replace("0", "");
        
        return answer;
    }
}
