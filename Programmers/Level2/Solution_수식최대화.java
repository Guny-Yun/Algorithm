package Level2;

import java.util.*;

public class Solution_수식최대화 {
	static char[] opers;
    static long answer;
    static String exp;
	public static void main(String[] args) {
		String expression = "100-200*300-500+20";
		solution(expression);
		System.out.println(answer);
	}
	public static long solution(String expression) {
        exp = expression;
        answer = -1;
        
        List<Character> list = new ArrayList<>();
        if(expression.contains("+")) list.add('+');
        if(expression.contains("-")) list.add('-');
        if(expression.contains("*")) list.add('*');
        opers = new char[list.size()];
        for(int i = 0; i < opers.length;i++) opers[i] = list.get(i);
        
        recur(0);
        
        return answer;
    }
    public static void recur(int v){
        if(v == opers.length){
            long tmp = cal();
            answer = Math.max(tmp, answer);
            return;
        }
        for(int i = v; i < opers.length;i++){
            swap(i, v);
            recur(v+1);
            swap(i, v);
        }
    }
    public static void swap(int i , int j){
        char ch = opers[i];
        opers[i] = opers[j];
        opers[j] = ch;
    }
    public static long cal(){
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0 ; i < opers.length; i++){
            hm.put(opers[i] + "", i);
        }
        StringBuilder sb = new StringBuilder();
        List<String> eq = new ArrayList<>();
        Stack<String> st = new Stack<>();
        
        int len = exp.length();
        
        for(int i = 0 ; i < len;i++){
            char ch = exp.charAt(i);
            if(ch == '+' || ch == '-' || ch == '*'){
                eq.add(sb.toString());
                sb.delete(0, sb.length());
                while(!st.isEmpty() && hm.get(ch + "") <= hm.get(st.peek())){
                    eq.add(st.pop());
                }
                st.push(ch +"");
            }else{
                sb.append(ch);
            }
        }
        eq.add(sb.toString());
        while(!st.isEmpty()) eq.add(st.pop());
        
        Stack<Long> val = new Stack<>();
        for(String s : eq){
            if(hm.containsKey(s)){
                long b = val.pop();
                long a = val.pop();
                if(s.equals("+")){
                    val.push(a + b);
                }
                if(s.equals("-")){
                    val.push(a-b);
                }
                if(s.equals("*")){
                    val.push(a*b);
                }                
            }else {
                val.push(Long.parseLong(s));
            }
        }
        return Math.abs(val.pop());
    }
}
