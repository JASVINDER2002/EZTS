package Day2305;
import java.util.*;
public class LargestElementinArrat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			max = Math.max(max,arr[i]);
		}
		System.out.println(max);
	}

}
