class Solution {
    public int[][] solution(int[][] arr) {
        int x = arr.length;
        int y = arr[0].length;
        int[][] answer = {};
        
        if (x == y) {
            return arr;
        } else if (x > y) {
            answer = new int[x][x];
        } else if (x < y) {
            answer = new int[y][y];
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                answer[i][j] = arr[i][j];
            }
        }
        
        return answer;
    }
}