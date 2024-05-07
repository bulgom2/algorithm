import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] arr = {a, b, c, d};
        
        Arrays.sort(arr);
        a = arr[0];
        b = arr[1];
        c = arr[2];
        d = arr[3];
        
        return 
            a == d ? a * 1111 :
            a == c ? (int) Math.pow((10 * a + d), 2) :
            b == d ? (int) Math.pow((10 * b + a), 2) :
            a == b && c == d ? (a + c) * Math.abs(a - c) :
            a == b ? c * d : 
            b == c ? a * d :
            c == d ? a * b :
            a;
    }
}