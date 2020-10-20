package Level3;

public class Solution_단어변환 {
	static String begin = "hit";
	static String target = "cog";
	static String[] words = {"hot", "dot", "dog", "lot", "cog"};
	static int answer = 51;
	public static void main(String[] args) {
		boolean[] visit = new boolean[words.length];
        dfs(begin, target, 0, words, visit);
        
        if(answer == 51) {
        	System.out.println(0);
        }else System.out.println(answer);
	}
	public static void dfs(String curWord, String target, int cnt, String[] words,boolean[] visit){
        if(curWord.equals(target)){
            answer = (answer > cnt) ? cnt: answer;
            return;
        }
        for(int i = 0; i < words.length;i++){
            if(!visit[i] && chk(curWord, words[i])){
                visit[i] = true;
                dfs(words[i], target, cnt+1, words, visit);
                visit[i] = false;
            }
        }
    }
	public static boolean chk(String curWord, String nextWord){
        int cnt = 0;
        for(int i = 0; i < curWord.length();i++){
            if(curWord.charAt(i) != nextWord.charAt(i)){
                cnt++;
            }
        }
        return cnt == 1 ? true : false;
    }
}
