package Day2;
import java.util.*;
public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = 5;
		for(int i = 1;i<=n;i++)
		{
		for(int j=1;j<=2*(n-i)-1;j++)
		{
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++)
		{
			System.out.println("*");
		}
		System.out.println();
		}
	}

}
