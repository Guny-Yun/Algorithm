package BaekJoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_5639_이진검색트리 {
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BTree tree = new BTree(Integer.parseInt(br.readLine()));
		
		String in = "";
		while((in = br.readLine()) != null && in.length() != 0) {
			tree = tree.add(tree,Integer.parseInt(in));
		}
		post(tree);
		System.out.println(sb);
	}
	public static void post(BTree tree) {
		if(tree.left != null)post(tree.left);
		if(tree.right != null)post(tree.right);
		
		sb.append(tree.num + "\n");
	}

}
class BTree{
	int num;
	BTree left;
	BTree right;
	
	public BTree(int num) {
		this.num = num;
		this.left = null;
		this.right = null;
	}

	public BTree add(BTree tree, int val) {
		BTree cur = null;
		if(tree == null)return new BTree(val);
	
		if(tree.num > val) {
			cur = add(tree.left, val);
			tree.left = cur;
		}
		else if(tree.num < val) {
			cur = add(tree.right, val);
			tree.right = cur;
		}
		return tree;
	}
}