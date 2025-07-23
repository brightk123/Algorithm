import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] numbers = new int[n];
		
		for(int i=0; i<n; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int b = sc.nextInt();
		int c = 0;
		
		for(int j=0; j<n; j++) {
			if(numbers[j]==b) {
				c++;
			}
		}
		
		System.out.println(c);
	}
}
