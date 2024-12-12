class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int xStart = 0;
        int xEnd = n - 1;
        int yStart = 0;
        int yEnd = n - 1;
        
        while (num <= n * n) {
            // 왼 -> 오
            for (int i = yStart; i <= yEnd; i++) {
                answer[xStart][i] = num++;
            }
            xStart++;   // x 시작 좌표 증가
            
            // 위 -> 아래
            for (int i = xStart; i <= xEnd; i++) {
                answer[i][yEnd] = num++;
            }
            yEnd--;     // y 끝 좌표 감소
            
            // 오 -> 왼
            for (int i = yEnd; i >= yStart; i--) {
                answer[xEnd][i] = num++;
            }
            xEnd--;     // x 끝 좌표 감소
            
            // 아래 -> 위
            for (int i = xEnd; i >= xStart; i--) {
                answer[i][yStart] = num++;
            }
            yStart++;   // y 시작 좌표 증가
        }
        
        return answer;
    }
}