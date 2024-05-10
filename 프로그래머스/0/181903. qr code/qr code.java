class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        int len = code.length();
        char[] arr = new char[len];        
        
        for (int i = 0; i < len; i++) {
            arr[i] = code.charAt(i);
            if (i % q == r) {
                answer += Character.toString(arr[i]);
            }
        }
        
        return answer;
    }
}