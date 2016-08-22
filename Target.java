import java.util.Scanner;


public class Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		System.out.println("enter the target value");
		int target=sc.nextInt();
		int []a=new int[n];
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
		a[i]=sc.nextInt();	
		}
		
       for(i=0;i<n;i++)
       {
    	   for(j=i+1;j<n;j++)
    	   {
    		   if(target==a[i]+a[j])
    		   {
    			   System.out.println(a[i]+" "+a[j]);
    		   }
    		   break;
    	   }
       }
	}
	

}
