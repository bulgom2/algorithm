class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        String[] arr = binomial.split(" ");
        int first = Integer.parseInt(arr[0]);
        int last = Integer.parseInt(arr[2]);
        
        switch(arr[1]) {
            case "+":
                answer = first + last;
                break;
            case "-":
                answer = first - last;
                break;
            case "*":
                answer = first * last;
                break;
            default:
                answer = first / last;
                break;
        }
        
        return answer;
    }
}