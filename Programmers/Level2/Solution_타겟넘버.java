package Level2;

public class Solution_타겟넘버 {
	static int[] numbers = { 1, 1, 1, 1, 1 };
	static int target = 5;

	public static void main(String[] args) {
		int answer = 0;
		answer = dfs(numbers, 0, target, 0 );
		System.out.println(answer);
	}

	public static int dfs(int[] numbers, int level, int target, int sum) {
		if (level == numbers.length) {
			if (sum == target)
				return 1;
			return 0;
		}
		return dfs(numbers, level + 1, target, sum + numbers[level])
				+ dfs(numbers, level + 1, target, sum - numbers[level]);
	}

}
