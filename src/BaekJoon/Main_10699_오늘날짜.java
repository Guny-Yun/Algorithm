package BaekJoon;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main_10699_오늘날짜 {
	public static void main(String[] args) throws Exception{
		Calendar cal= Calendar.getInstance();
	    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    System.out.println(df.format(cal.getTime()));
	}
}
