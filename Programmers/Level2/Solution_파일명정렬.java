package Level2;

import java.util.Arrays;
import java.util.Comparator;

public class Solution_파일명정렬 {

	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		
		solution(files);
		for(String s: files) {
			System.out.println(s);
		}
	}
	public static String[] solution(String[] files) {
		Arrays.sort(files, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				String[] file1 = detach(s1);
				String[] file2 = detach(s2);
				
				int headVal = file1[0].compareTo(file2[0]);
				
				if(headVal == 0) {
					int tmp1 = Integer.parseInt(file1[1]);
					int tmp2 = Integer.parseInt(file2[1]);
					return tmp1-tmp2;
				}else return headVal;
			}
			
			private String[] detach(String s) {
				String head = "";
				String num = "";
				String tail = "";
				
				int idx = 0;
				for(; idx <s.length();++idx) {
					char ch = s.charAt(idx);
					if(ch >= '0' && ch <= '9')break;
					head += ch;
				}
				for(; idx < s.length();++idx) {
					char ch = s.charAt(idx);
					if(!(ch >= '0' && ch <='9'))break;
					num += ch;
				}
				for(; idx <s.length(); ++idx) {
					char ch = s.charAt(idx);
					tail += ch;
				}
				String[] file = {head.toLowerCase(), num , tail};
				return file;
			}
			
		});
		return files;
	}

}
