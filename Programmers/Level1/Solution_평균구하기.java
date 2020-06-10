package Level1;

public class Solution_평균구하기 {
	static int[] arr = {1,2,3,4};
	public static void main(String[] args) {
		double answer = 0;
        double sum = 0;
        for(int i = 0 ; i < arr.length; i++){
            sum += arr[i];
        }
        answer = sum/arr.length;
        
        System.out.println(answer);
	}

}
