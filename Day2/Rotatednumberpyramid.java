package Day2;
import java.util.*;
public class Rotatednumberpyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc = new Scanner(System.in);
             int n = 5;
             for(int i = 1;i<=n;i++)
             {
            	 for(int j = i;j<2*n-i;j++)
            	 {
            		 System.out.print(" ");
            	 }
            	 int l=i;
            	 for(int k = 1;k<=i;k++)
            	 {
            		 
            		 System.out.print(l+" ");
            		 l++;
            	 }
            	 System.out.println();
             }
	}

}
