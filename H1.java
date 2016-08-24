import java.util.Arrays;
import java.util.Scanner;


public class H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int []a=new int[10];
     
     int i=0,m;
     while(n!=0)
     {
    	 m=n%10;
      a[i]=m;
    	 i++;
    	 n=n/10;
    	 
     }
     Arrays.sort(a);
     for(i=0;i<a.length-3;i++)
     {  if(a[i]!=0)
    	 System.out.println(a[i]);
     }
     
	}

}
