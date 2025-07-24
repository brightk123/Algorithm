import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.next();
		int n = sc.nextInt();
		char[] letters = word.toCharArray();
		
		System.out.println(letters[n-1]);
		
	}
}
