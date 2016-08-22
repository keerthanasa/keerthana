import java.util.Arrays;
import java.util.Scanner;


public class Uni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(j=0;j<n;j++)
		{
			if(a[j]==j)
			{
				System.out.println(a[j]);
			}
		}

	}

}
