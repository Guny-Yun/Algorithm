package BaekJoon;

import java.util.Scanner;
import java.util.Stack;

public class Main_9012_괄호 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Stack<Integer> stack = new Stack<Integer>();
      String[] st = new String[50];
	  Scanner sc = new Scanner(System.in);
      int cnt = sc.nextInt();
  
      for(int i=0; i<cnt; i++) {
    	int count = 0;
    	boolean vps;
    	String a = sc.next();
    	for(int j=0; j<a.length(); j++) {
    		st[j]=String.valueOf(a.charAt(j));
    		if(count<0) {
    			vps = false;
    			break;
    		}
    		if(st[j].equals("(")) {
    			count++;
    		}else {
    			count--;
    		}
    		
    	}
    	if(count==0) 
    		vps=true;
    	else
    		vps=false;
    	System.out.println(vps?"YES":"NO");
    	stack.clear();

    }
   }
}