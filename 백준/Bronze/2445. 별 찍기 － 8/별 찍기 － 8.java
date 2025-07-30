import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 0; i<(2*num); i++) {
			if(i<num) {
				for(int j = 0; j<(2*num); j++) {
					
					if (j<(i+1) || j>(2*num-2-i)) {
						System.out.print("*");
					}else {System.out.print(" ");}
				}
				
			} else {
				for(int j = 0; j<(2*num); j++){
					
					if (j<(2*num-i-1) || j>(i)) {
						System.out.print("*");
					}else {System.out.print(" ");}
					
				}
			}
			System.out.println();
			
		}
	}
}