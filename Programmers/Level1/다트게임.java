package Level1;

public class 다트게임 {
	static String dartResult = "1D2S3T*";
	public static void main(String[] args) {
		char[] dartChar = dartResult.toCharArray();
		int[] score = new int[3];
		int answer = 0;
		int cur = -1;
		
		for(int i = 0 ; i < dartChar.length;i++) {
			if(dartChar[i] >= '0' && dartChar[i] <= '9') {
				cur++;
				if(dartChar[i] == '1' && dartChar[i+1] == '0') {
					score[cur] = 10;
					i++;
				}else score[cur] = dartChar[i]-'0';
			}else {
				switch(dartChar[i]) {
				case 'S':
					score[cur] = (int)Math.pow(score[cur], 1);
					break;
				case 'D':
					score[cur] = (int)Math.pow(score[cur], 2);
					break;
				case 'T':
					score[cur] = (int)Math.pow(score[cur], 3);
					break;
				case '*':
					if(cur>0) {
						score[cur] *= 2;
						score[cur-1] *=2;
					}else score[cur] *=2;
					break;
				case '#':
					score[cur] *= -1;
					break;
				}
			}
		}
		for(int sum : score)answer += sum;
		System.out.println(answer);
	}

}
