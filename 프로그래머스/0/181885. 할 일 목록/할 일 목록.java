import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        List<Integer> idx = new ArrayList<>();
        List<String> todo = new ArrayList<>();
        
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                idx.add(i);
            }
        }
        
        for (int i = 0; i < idx.size(); i++) {
            todo.add(todo_list[idx.get(i)]);
        }
        
        String[] answer = todo.toArray(String[]::new);
        
        return answer;
    }
}