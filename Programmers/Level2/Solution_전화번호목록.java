package Level2;

public class Solution_전화번호목록 {
	static String[] phone_book = {"119","97674223","1195524421"};
	public static void main(String[] args) {
		boolean answer = true;
		
		for(int i = 0; i < phone_book.length;i++) {
			for(int j = i+1 ; j < phone_book.length;j++ ) {
				if(phone_book[i].startsWith(phone_book[j])) {
					answer = false;
					break;
				}
				if(phone_book[j].startsWith(phone_book[i])) {
					answer = false;
					break;
				}
			}
		}
		System.out.println(answer);
	}
}
