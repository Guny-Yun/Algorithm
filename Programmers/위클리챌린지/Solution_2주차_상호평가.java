package 위클리챌린지;

import java.util.Arrays;

public class Solution_2주차_상호평가 {
	// {{50,90},{50,87}}
	public static void main(String[] args) {
		int[][] scores = { { 100, 90, 98, 88, 65 }, { 50, 45, 99, 85, 77 }, { 47, 88, 95, 80, 67 },
				{ 61, 57, 100, 80, 65 }, { 24, 90, 94, 75, 65 } };
		System.out.println(solution(scores));
	}

	public static String solution(int[][] scores) {
		String answer = "";
		for(int i = 0 ; i < scores.length;i++) {
			double avg = 0.0;
			int[] arr = new int[scores.length];
			for(int j = 0 ; j < arr.length;j++) {
				arr[j] = scores[j][i];
			}
			Arrays.sort(arr);
			int self = scores[i][i];
			int max = arr[arr.length-1];
			int min = arr[0];
			int sum = 0;
			if(self == max) {
				if(arr[arr.length-2] != max)arr[arr.length-1] = -1;
			}
			if(self == min) {
				if(arr[1] != min)arr[0] = -1;
			}
			int cnt = 0;
			for(int j = 0 ; j < arr.length; j++) {
				if(arr[j] != -1) {
					cnt++;
					sum += arr[j];
				}
			}
			avg = sum / cnt;
			answer += grade(avg);
		}
		return answer;
	}
	public static String grade(double avg) {
		if(avg >= 90)return "A";
		else if(avg >=80 && avg < 90)return "B";
		else if(avg >= 70 && avg < 80)return "C";
		else if(avg >= 50 && avg < 70)return "D";
		else return "F";
	}
}
