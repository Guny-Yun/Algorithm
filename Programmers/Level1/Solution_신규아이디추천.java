package Level1;


public class Solution_신규아이디추천 {
	static String new_id = "...!@BaT#*..y.abcdefghijklm";
	public static void main(String[] args) {
		String answer = "";
		
		//1
		new_id = new_id.toLowerCase();
		
		//2
		String pattern = "[^-_.0-9a-z]";
		new_id = new_id.replaceAll(pattern, "");
		
		//3
		pattern = "\\.{2,}";
		new_id = new_id.replaceAll(pattern, ".");
		
		//4
		if(new_id.charAt(0) == '.')
			new_id = new_id.substring(1);
		if(!"".equals(new_id) && new_id.charAt(new_id.length() -1) =='.')
			new_id = new_id.substring(0, new_id.length()-1);
		
		//5
		if("".equals(new_id)) new_id = "a";
		
		//6
		if(new_id.length() >= 16) {
			new_id = new_id.substring(0,15);
			if(new_id.charAt(new_id.length()-1) == '.')
				new_id = new_id.substring(0, new_id.length() -1);
		}
		
		//7
		if(new_id.length() <= 2) {
			while(new_id.length() < 3) {
				new_id += new_id.substring(new_id.length() -1);
			}
		}
		
		System.out.println(new_id);
	}

}
