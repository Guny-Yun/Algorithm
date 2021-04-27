package Level1;

public class Solution_소수만들기 {
	
    static int[] nums = {1,2,7,6,4};
	public static void main(String[] args) {
		int answer = 0;
		for(int i = 0 ; i < nums.length;i++) {
			for(int j = i + 1; j <nums.length;j++) {
				for(int k = j +1 ; k < nums.length;k++) {
					if(isPrime(nums[i] + nums[j] + nums[k]))answer++;
				}
			}
		}
		System.out.println(answer);
	}
    public static boolean isPrime(int n){
        for(int i =2 ; i * i <= n; i++){
            if(n % i == 0)return false; // 소수 아니다
        }
        return true; // 소수다
    }
}
