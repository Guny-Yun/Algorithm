package Level1;

public class Solution_핸드폰번호가리기 {
	static String phone_number = "01444";
	public static void main(String[] args) {
		String answer = "";
		for(int i = 0 ; i < phone_number.length()-4;i++) {
			answer += "*";
		}
		answer += phone_number.substring(phone_number.length()-4,phone_number.length());
		
		System.out.println(answer);
	}

}
