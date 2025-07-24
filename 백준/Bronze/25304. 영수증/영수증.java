import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int firstSum = sc.nextInt();
		int n = sc.nextInt();
		int[][] products = new int[n][2];
		int sum = 0;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<2; j++) {
				products[i][j] = sc.nextInt();
			}
			sum = sum + products[i][1] * products[i][0];
		}
		
		if(sum == firstSum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
