package Level2;

import java.util.ArrayList;

public class Solution_뉴스클러스터링 {
	static String str1 = "FRANCE";
	static String str2 = "french";
	
	public static void main(String[] args) {
		int answer = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		ArrayList<String> set1 = new ArrayList<>();
		ArrayList<String> set2 = new ArrayList<>();
		set1 = makeSet(str1);
		set2 = makeSet(str2);
		
		double inter = getInter(set1, set2).size();
		double union = set1.size() + set2.size() - inter;
		
		if(inter == 0 && union == 0) {
			answer = 65536;
		}else {
			answer = (int)(inter/union * 65536);
		}
		System.out.println(answer);
		
		
	}
	public static ArrayList<String> makeSet(String str) {
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0 ; i < str.length() -1; i++) {
			char f = str.charAt(i);
			char s = str.charAt(i+1);
			if(f >= 'a' && f<= 'z'&& s <='z'&& s>='a') {
				list.add(f+""+s);
			}
		}
		return list;
	}
	public static ArrayList<String> getInter(ArrayList<String> A, ArrayList<String> B){
		ArrayList<String> list = new ArrayList<>();
		A = (ArrayList<String>) A.clone();
		B = (ArrayList<String>) B.clone();
		
		for(String s : A) {
			if(B.contains(s)) {
				list.add(s);
				B.remove(s);
			}
		}
		
		return list; 
	}
}
