import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		

		for(int i = 0; i<(2*num-1); i++) {
			
			for(int j = 0; j<(2*num-1); j++) {
				
				if(i<num) {
					
					if(j>(i-1) && j<(2*num-1-i)) {
					
						System.out.print("*");
					} else if(j<(i))
					{System.out.print(" ");}
				} else {
					if(j<(2*num-i-2)) {
						System.out.print(" ");
					} else if(j<(i+1))
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}