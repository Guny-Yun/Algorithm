package Level3;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Solution_디스크컨트롤 {

	public static void main(String[] args) {
		int[][] jobs = {{0,3},{1,9},{2,6}};
		System.out.println(solution(jobs));
	}
	static public int solution(int[][] jobs) {
        int answer = 0;
        PriorityQueue<Job> pq = new PriorityQueue<>();
        List<Job> list = new ArrayList<>();
        for(int i = 0 ; i < jobs.length;i++){
            Job tmp = new Job(jobs[i][0], jobs[i][1]);
            pq.offer(tmp);
        }
        for(int i = 0 ; i < jobs.length;i++) {
        	list.add(pq.poll());
        }
        
        int time = 0;
        int sum = 0;
        while(list.size() > 0) {
        	for(int i = 0 ; i <list.size();i++) {
        		if(time >= list.get(i).in) {
        			time += list.get(i).time;
        			sum += time - list.get(i).in;
        			list.remove(i);
        			break;
        		}
        		if(i == list.size()-1)time++;
        	}
        }
        answer = (sum/jobs.length);
        
        return answer;
    }
    static class Job implements Comparable<Job> {
        int in;
        int time;
        public Job(int in, int time){
            this.in = in;
            this.time = time;
        }
        
        @Override
        public int compareTo(Job t){
        	if(this.time < t.time)return -1;
        	else if(this.time == t.time) {
        		if(this.in < t.in)return -1;
        		else return 1;
        	}else return 1;
        }
    }

}
