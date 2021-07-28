package Exercise;

public class naver_1 {
//	static int n = 7;
//	static int[] p = {6,2,1,0,2,4,3};
//	static int[] c = {3,6,6,2,3,7,6};
	static int n = 6;
	static int[] p = {5,4,7,2,0,6};
	static int[] c = {4,6,4,9,2,3};
	public static void main(String[] args) {
		int tot_stock = 0;
		int cur_price = 100;
		int day_cnt = 2;
		int sales = 0;
		int sale_day = 0;
		for(int i = 0 ; i < n;i++) {
			tot_stock += p[i];
			if(tot_stock >= c[i]) {
				tot_stock = tot_stock - c[i];
				sales += c[i] * cur_price;
				cur_price = 100;
				day_cnt = 2;
				sale_day = i+1;
			}else {
				day_cnt--;
				cur_price /= 2;
				if(day_cnt < 0) {
					sale_day = i+1;
					break;
				}
			}
		}
		double res = (double)(sales/sale_day);
		System.out.println(String.format("%.2f", res));
	}

}
