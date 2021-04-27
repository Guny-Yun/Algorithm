package Level1;

public class Solution_로또의최고순위와최저순위 {
	static int[] lottos = {};
	static int[] win_nums = {};
	public static void main(String[] args) {
		int[] answer = new int[2];
        int correct = 0;
        int zero = 0;
        for(int i = 0; i < 6; i++){
            for(int j = 0 ; j < 6; j++){
                if(lottos[i] == win_nums[j])correct++;
            }
            if(lottos[i] == 0)zero++;
        }
        int high = zero + correct;
        int low = correct;
        
        answer[0] = 7 - high;
        answer[1] = 7 - low;
        for(int i = 0 ; i < 2; i++){
            if(answer[i] == 7 || answer[i] == 6) answer[i] = 6;
        }

	}

}
