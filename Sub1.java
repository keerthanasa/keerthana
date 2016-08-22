import java.util.Scanner;


public class Sub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=sc.nextInt();
		String a1=" ";
		String a2=" ";
		int []a=new int[n];
		int []b=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			 a1=a1+a[i];
		}
		for(j=0;j<n1;j++)
		{
			b[j]=sc.nextInt();
			a2=a2+b[j];
			
		}
		if(a1.contains(a2))
				{
			
			System.out.println("a1 is a subset of a2");
		}
		else
		{
			System.out.println("a1 is not a subset of a2");
		}

	}

}
