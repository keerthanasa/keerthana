import java.util.Scanner;


public class Single {

	public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter only odd numbers");
 int n=sc.nextInt();
 int i=0,j=0;
 int []a=new int[n];
 for(i=0;i<n;i++)
 {
	a[i]=sc.nextInt(); 
 }
 
 for(i=0;i<n;i++)
 {
	 for(j=i+1;j<n;j++)
	 {
		 if(a[i]==a[j])
		 {
			a[i]=0;
			a[j]=0;
		 }
	 }
 }
 for(i=0;i<n;i++)
 {
	 if(a[i]!=0)
	 {
		 System.out.println(a[i]);
		
	 }
 }
 

	}

}
