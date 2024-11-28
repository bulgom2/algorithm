class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int idx = myString.lastIndexOf(pat);
        
        if (pat.length() == 1) {
            idx += 1;
        } else {
            idx = idx + pat.length();
        }
        
        answer = myString.substring(0, idx);
        
        return answer;
    }
}