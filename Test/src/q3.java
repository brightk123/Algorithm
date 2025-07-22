import java.util.Scanner;
import java.io.FileInputStream;
import java.util.*;

class q3
{
	public static void main(String args[]) throws Exception
	{
		System.setIn(new FileInputStream("input3.txt"));
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		
        int[] nums = new int[T];
        
		for(int test_case = 0; test_case < T; test_case++)
		{
			nums[test_case] = sc.nextInt();
		}
        
        Arrays.sort(nums);
        int mid = nums[T/2];
        
        System.out.println(mid);
        
	}
}