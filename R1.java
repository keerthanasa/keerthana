import java.util.Scanner;


public class R1 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	int len=0,i=0;
	String[] s1=s.split(" ");
	len=s1.length;
	for(i=len-1;i>=0;i--)
	{
		System.out.print(s1[i]+  " ");
	}
	
	

	}

}
