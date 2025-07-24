import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// 쿼터 0.25
		// 다임 0.10
		// 니켈 0.05
		// 페니 0.01
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] coins = new int[n];
		
		for (int i = 0; i < n; i++) {
			coins[i] = sc.nextInt();
		}
		
		for	(int i = 0; i < n; i++) {
			int a = coins[i] / 25;
			int b = (coins[i] - (a*25))/10;
			int c = (coins[i] - a*25 - b*10)/5;
			int d = (coins[i] - a*25 - b*10 - c*5);
			System.out.println(a + " " + b + " " + c + " " +d);
		}
	}
}
