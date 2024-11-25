class Solution {
    public String solution(String myString) {
        
        String toLC = myString.toLowerCase();
        String answer = toLC.replace('a', 'A');
        
        return answer;
    }
}