import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// N : 바구니 갯수
		// M : 공을 바꾼 횟수
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] changes = new int[M][2];
		int[] balls = new int[N];
		int temp = 0;
		
		for (int i = 0; i<N; i++) {
			balls[i] = i+1;
		}
		
		for(int i = 0; i<M; i++) {
			for(int j = 0; j<2; j++) {
				changes[i][j] = sc.nextInt();
			}
			
			temp = balls[changes[i][0]-1];
			balls[changes[i][0]-1] = balls[changes[i][1]-1];
			balls[changes[i][1]-1] = temp;
		}
		
		int j = 0;
		for(int i = 0; i<balls.length; i++) {
			System.out.print(balls[i]);
			j++;
			if(j<balls.length) {
				System.out.print(" ");
			}
		}
	}
}
