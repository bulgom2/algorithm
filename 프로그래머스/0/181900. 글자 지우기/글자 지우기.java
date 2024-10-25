class Solution {
    public String solution(String my_string, int[] indices) {
        char[] charArray = my_string.toCharArray(); 
        
        for (int idx : indices) {
            charArray[idx] = '0';
        }

        String answer = new String(charArray).replace("0", "");
        
        return answer;
    }
}