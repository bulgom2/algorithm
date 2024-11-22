class Solution {
    public int solution(int[] num_list) {
        int morethan11 = 0;
        int lessthan10 = 1;
        int answer = 0;
        
        
        if (num_list.length >= 11) {
            for (int i = 0; i < num_list.length; i++) {
                morethan11 += num_list[i];
            }
            answer = morethan11;
        } else {
            for (int i = 0; i < num_list.length; i++) {
                lessthan10 *= num_list[i];
            }
            answer = lessthan10;
        }
        
        return answer;
    }
}