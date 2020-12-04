package BaekJoon;

import java.io.*;
import java.util.*;

public class Main_1991_트리순회 {
	static Map<String, List<String>> map = new HashMap<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0 ; i < N;i++) {
			String[] tmp = br.readLine().split("\\s");
			List<String> list = new ArrayList<>();
			
			list.add(tmp[1]);
			list.add(tmp[2]);
			map.put(tmp[0], list);
		}
		
		preorder("A");
		System.out.println();
		inorder("A");
		System.out.println();
		postorder("A");
		
	}
	public static void preorder(String s) {
		if(s.equals("."))return;
		
		System.out.print(s);
		preorder(map.get(s).get(0));
		preorder(map.get(s).get(1));
	}
	public static void inorder(String s) {
		if(s.equals("."))return ;
		
		inorder(map.get(s).get(0));
		System.out.print(s);
		inorder(map.get(s).get(1));
	}
	public static void postorder(String s) {
		if(s.equals("."))return;
		
		postorder(map.get(s).get(0));
		postorder(map.get(s).get(1));
		System.out.print(s);
	}
}
