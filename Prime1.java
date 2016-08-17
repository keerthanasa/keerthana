import java.util.Scanner;


public class Prime1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("enter the first range");
    int n1=sc.nextInt();
    System.out.println("enter the second range");
    int n2=sc.nextInt();
    int i=0,j=0;
    int[] a=new int [10];
 
    for(i=n1;i<=n2;i++)
    {   if(isprime(i)==1)
       {
    	a[j]=i;
    	j++;
    }
    }
    for(j=0;j<n2;j++)
    {
    	if(a[j]!=0)
    System.out.println(a[j]);
    }
	}


public static int isprime(int n1)
{  int i=0;
   int f=1;
	for(i=2;i<=Math.sqrt(n1);i++)
	{
		if(n1%i==0)
		{
			f=0;
		}
	}
	
	return f;
}
}
