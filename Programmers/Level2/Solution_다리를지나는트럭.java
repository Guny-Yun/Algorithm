package Level2;

import java.util.*;

public class Solution_다리를지나는트럭 {
	static int bridge_length = 2;
	static int weight = 10;
	static int[] truck_weights = { 7, 4, 5, 6 };

	public static void main(String[] args) {
		int answer = 0;
		int time = 0;
		int total_weight = weight;

		Queue<Truck> wait = new LinkedList<Truck>();
		List<Truck> bridge = new ArrayList<Truck>();
		for (int i = 0; i < truck_weights.length; i++) {
			wait.offer(new Truck(truck_weights[i], bridge_length));
		}

		while (!(wait.isEmpty() && bridge.isEmpty())) {
			time++;
			if(!bridge.isEmpty() && bridge.get(0).position <= 0) {
				total_weight += bridge.get(0).weight;
				bridge.remove(0);
			}
			
			if(!wait.isEmpty() && total_weight - wait.peek().weight >= 0) {
				total_weight -= wait.peek().weight;
				bridge.add(wait.poll());
			}
			
			for(int i = 0; i < bridge.size();i++) {
				Truck tmp = bridge.get(i);
				tmp.position--;
			}

		}
		answer = time;
		System.out.println(answer);

	}

	static class Truck {
		int weight;
		int position;

		public Truck(int weight, int position) {
			this.weight = weight;
			this.position = position;
		}
	}
}
