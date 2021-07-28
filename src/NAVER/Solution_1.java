package NAVER;

public class Solution_1 {
	static String[] week = {"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
	static String s = "Sat";
	static int K = 23;
	public static void main(String[] args) {
		int day = 0;
		if(s.equals("Mon")) {
			day = 0;
		}else if(s.equals("Tue")) {
			day = 1;
		}else if(s.equals("Wed")) {
			day =2;
		}else if(s.equals("Thu")) {
			day = 3;
		}else if(s.equals("Fri")) {
			day = 4;
		}else if(s.equals("Sat")) {
			day = 5;
		}else if(s.equals("Sun")) {
			day = 6;
		}
		int res = (day + K)%7; 
		System.out.println(week[res]);
	}

}
