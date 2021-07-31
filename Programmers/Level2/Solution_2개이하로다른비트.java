package Level2;

public class Solution_2개이하로다른비트 {

	public static void main(String[] args) {
		long[] numbers = {};
		solution(numbers);
	}
	public static long[] solution(long[] numbers) {
		long[] answer = new long[numbers.length];
		for(int i = 0 ; i < numbers.length;i++) {
			if(numbers[i] %2 == 0)answer[i] = numbers[i]+1;
			else {
				StringBuilder tmp = new StringBuilder();
				String bi = Long.toBinaryString(numbers[i]);
				
				if(!bi.contains("0")) {
					tmp.append("10");
					tmp.append(bi.substring(1).replace("0", "1"));
				}else {
					int last = bi.lastIndexOf("0");
					int first = bi.indexOf("1",last);
					tmp.append(bi, 0, last).append("1");
					
					tmp.append("0");
					tmp.append(bi.substring(first + 1));
				}
				answer[i] = Long.parseLong(tmp.toString(),2);
			}
		}
		return answer;
	}
}
