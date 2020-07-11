package Level2;

public class Solution_카펫 {
	static int brown =  24;
	static int yellow = 24;
	public static void main(String[] args) {
		int[] answer = new int[2];
		int wid = 0;
		int hei = 0;
		
		for(int i =1; i <= yellow/2+1; i++) {
			wid = i;
			hei = (yellow%i == 0) ? yellow/i : yellow/i+1;
			
			if(wid * 2 + hei * 2 + 4 == brown)break;
		}
		answer[0] = Math.max(wid + 2, hei + 2);
		answer[1] = Math.min(wid + 2, hei + 2);
		
		
		
		
		System.out.println(answer[0] + " " + answer[1]);
	}

}
