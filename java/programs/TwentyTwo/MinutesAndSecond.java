package programs.TwentyTwo;

import java.util.Scanner;

public class MinutesAndSecond {
	
	public static String convertTime(String[] time) {
		int minute=0;
		int second=0;
		for (int i = 0; i < time.length; i++) {
			String[] ts = time[i].split(":");
			minute=minute+Integer.parseInt(ts[0]);
			second=second+Integer.parseInt(ts[1]);
		}
		int totalSec=minute*60+second;
		return totalSec/60+" : "+totalSec%60;
		
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input you want to enter");
		int num=scan.nextInt();
		String[] time=new String[num];
		for (int i = 0; i < num; i++) {
			time[i]=scan.next();
		}
		System.out.println(convertTime(time));
		scan.close();
	}

}
