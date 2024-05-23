package Day2;
import java.util.*;
public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		for(int i = 1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
