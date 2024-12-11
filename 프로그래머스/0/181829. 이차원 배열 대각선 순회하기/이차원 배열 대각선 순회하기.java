class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int arr1 = board.length;
        int arr2 = board[0].length;

        for (int i = 0; i < arr1; i++) {
            for (int j = 0; j < arr2; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        
        return answer;
    }
}