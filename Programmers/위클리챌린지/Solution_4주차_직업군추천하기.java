package 위클리챌린지;

import java.util.ArrayList;

public class Solution_4주차_직업군추천하기 {

	public static void main(String[] args) {
		String[] table = { "SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
				"HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
				"GAME C++ C# JAVASCRIPT C JAVA" };
		String[] languages = {"PYTHON", "C++", "SQL"};
		int[] preference = {7,5,5};
		
		System.out.println(solution(table,languages,preference));
	}
//		SI	 		CONTENTS	HARDWARE	PORTAL	 	GAME 고정
// 
//	5	JAVA		JAVASCRIPT	C			JAVA		C++
//	4	JAVASCRIPT	JAVA		C++			JAVASCRIPT	C#
//	3	SQL			PYTHON		PYTHON		PYTHON		JAVASCRIPT
//	2	PYTHON		SQL			JAVA		KOTLIN		C
//	1	C#			C++			JAVASCRIPT	PHP			JAVA
	// CONTENTS, GAME, HARDWARE, PORTAL, SI 이름순서
	public static String solution(String[] table, String[] languages, int[] preference) {
		String answer = "";
		int[] score = new int[5];
		String[] scrName = new String[5];
		
		for(int i = 0 ; i < 5; i++) {
			String[] tmp = table[i].split(" ");
			scrName[i] = table[i].split(" ")[0];
			
			for(int j = 1;j < tmp.length;j++) {
				for(int k = 0 ; k <languages.length;k++) {
					if(tmp[j].equals(languages[k])) {
						score[i] += (tmp.length-j) * preference[k];
					}
				}
			}
		}
		
		int cmp_score = score[0];
		String cmp_name = scrName[0];
		
		for(int i = 1; i < score.length;i++) {
			if(cmp_score <= score[i]) {
				if(cmp_score == score[i] && cmp_name.compareTo(scrName[i]) > 0) {
					cmp_name = scrName[i];
				}else if(cmp_score < score[i]) {
					cmp_score = score[i];
					cmp_name = scrName[i];
				}
			}
		}
		answer = cmp_name;
        return answer;
	}
}
