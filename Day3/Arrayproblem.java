package Day3;
//Writen a program to take input of marks in  5 subjects from user in an array and then find out the Total and Average.
import java.util.*;
public class Arrayproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] subjects = new int[n];
		for(int i=0;i<n;i++)
		{
			subjects[i] = sc.nextInt();
		}
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum=sum+subjects[i];
		}
		int total = sum;
		System.out.println("The sum of the subjects are "+total+" and the averge is "+sum/n);
		
	}

}
