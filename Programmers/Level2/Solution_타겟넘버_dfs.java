package Level2;

public class Solution_타겟넘버_dfs {
	static int[] numbers = { 1, 1, 1, 1, 1 };
	static int target = 3;

	public static void main(String[] args) {
		System.out.println(solution(numbers, target));
	}
	public static int solution(int[] numbers, int target) {
        int answer = 0;
        int cur = numbers[0];
        
        answer += dfs(cur, 1, numbers, target);
        answer += dfs(-cur, 1,numbers, target);
        return answer;
    }
    public static int dfs(int prev, int level, int[] numbers, int target){
        if(level == numbers.length){
            if(target == prev) return 1;
            
            return 0;
        }
        
        int cur1 = prev + numbers[level];
        int cur2 = prev - numbers[level];
        int ans = 0;
        ans += dfs(cur1, level+1, numbers, target);
        ans += dfs(cur2, level+1, numbers, target);
        
        return ans;
    }

}
