import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] ingredient) {
        // Stack 구조를 활용해서 문제해결
        List<Integer> list = new ArrayList<>();
        int count = 0;
        
        // 재료가 쌓일 때마다, 최근 4개의 재료 확인 [1,2,3,1]
        for (int item : ingredient) {
            list.add(item);
            
            // 재료의 개수 체크
            if (list.size() >= 4) {
                // 재료 구성 확인
                if (list.get(list.size() - 4) == 1 && list.get(list.size() - 3) == 2 && list.get(list.size() - 2) == 3 && list.get(list.size() - 1) == 1) {
                    
                    for (int i = 0; i < 4; i++) list.remove(list.size() - 1);
                    count++;
                }
            }
        }
        
        return count;
    }
}