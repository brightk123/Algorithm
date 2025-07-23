import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int num = 0;
		String[] words = new String[n];
		
		for (int i = 0; i < n; i++) {
			words[i] = sc.next();
			
			if (isGroupWord(words[i])) {
				num++;
			}
			
		}
		
		System.out.println(num);
	}
	
	public static boolean isGroupWord(String a) {
		boolean[] seen = new boolean[26];
		
		char prev = 0;
		
		for (int i = 0; i < a.length(); i++) {
			char curr = a.charAt(i);
			
			if (curr != prev) {
				if(seen[curr-'a']) {
					return false;
				}
			seen[curr - 'a'] = true;
			}
			
			prev = curr;
		}
		
		return true;
		
	}
}
