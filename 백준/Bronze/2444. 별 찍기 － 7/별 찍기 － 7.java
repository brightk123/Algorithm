import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i<(2*num-1); i++) {
			
			if(i<num) {
				for(int j = 0; j<(num+i); j++) {
					
					if( j>(num-i-2) && j<(num+i)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			} else {
				
				for(int j = 0; j<(2*num-1-(i-num+1)); j++) {
					
					if( j<(i-num+1)) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}