package Day2;
import java.util.*;
public class Pattern {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
				System.out.println();
		}
	}
}
//import java.util.*;
//Scanner sc = new Scanner(System.in);
//System.out.println("Enter the value:");
//int n = sc.nextInt();