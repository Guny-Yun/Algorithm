package Level3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution_베스트앨범 {

	public static void main(String[] args) {
		String[] genres = {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = {500, 600, 150, 800, 2500};
		int[] answer = solution(genres, plays);
		for(int a : answer) {
			System.out.print(a + " ");
		}
	}
	static public int[] solution(String[] genres, int[] plays) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<String, Integer> genMap = new HashMap<>();
        for(int i = 0 ; i < genres.length;i++) {
        	genMap.put(genres[i], genMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<String> keylist = new ArrayList<>(genMap.keySet());
        Collections.sort(keylist, (o1, o2) -> (genMap.get(o2).compareTo(genMap.get(o1))));
        
        for(String key : keylist) {
        	HashMap<Integer, Integer> hs = new HashMap<>();
        	for(int i = 0 ; i < genres.length;i++) {
        		if(key.equals(genres[i])) {
        			hs.put(i, plays[i]);
        		}
        	}
        	List<Integer> list = new ArrayList<>(hs.keySet());
        	list.sort((s1, s2) -> hs.get(s2).compareTo(hs.get(s1)));
        	int j = 0;
        	for(Integer c : list) {
        		if(j > 1)break;
        		ans.add(c);
        		j++;
        	}
        }
        int[] answer = new int[ans.size()];
        for(int i = 0 ; i <ans.size();i++) {
        	answer[i] = ans.get(i);
        }
        
        return answer;
    }
}
