import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        StringBuilder sb = new StringBuilder(myStr);
        
        for (int i = 0; i < myStr.length(); i++) {
            if (myStr.charAt(i) == 'a') {
                sb.setCharAt(i, ' ');
            } else if (myStr.charAt(i) == 'b') {
                sb.setCharAt(i, ' ');
            } else if (myStr.charAt(i) == 'c') {
                sb.setCharAt(i, ' ');
            }
        }
        
        myStr = sb.toString();
        
        String[] arr = myStr.split(" ");
        List<String> list = new ArrayList<>();
        
        if (arr.length == 0) {
            list.add("EMPTY"); 
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (!arr[i].isEmpty()) {
                    list.add(arr[i]);
                }
            }
        }
        
        answer = list.stream().toArray(String[]::new);

        return answer;
    }
}