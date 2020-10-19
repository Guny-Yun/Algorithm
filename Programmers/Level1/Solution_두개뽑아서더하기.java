package Level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution_두개뽑아서더하기 {
	static int[] numbers = {2,1,3,4,1};
	public static void main(String[] args) {
		int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0 ;  i< numbers.length - 1;i++){
            for(int j = i+1; j < numbers.length;j++){
                int tmp = numbers[i] + numbers[j];
                if(!list.contains(tmp)){
                    list.add(tmp);
                }
            }
        }
        answer = new int[list.size()];
        for(int i = 0 ; i < list.size();i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
	}
}
