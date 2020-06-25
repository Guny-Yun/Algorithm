package Level2;

public class Solution_스킬트리 {
	static String skill = "CBD";
	static String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
	public static void main(String[] args) {
		int answer = 0;
		
		for(int i = 0 ; i < skill_trees.length;i++) {
			int idx = 0;
			boolean flag = true;
			String[] tree = skill_trees[i].split("");
			
			for(String s : tree) {
				if(idx == skill.indexOf(s))idx++;
				else if(idx < skill.indexOf(s)) {
					flag = false;
					break;
				}
			}
			if(flag)answer++;
		}
		System.out.println(answer);
	}

}
