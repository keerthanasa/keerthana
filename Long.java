import java.util.Scanner;

public class Long{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the String1");
                                     System.out.println("enter the String2");
		String s1=sc.next();
	                    String s2=sc.next();
		if(s1.contains(s2))
			System.out.println(s2);
		else
			System.out.println("no");
		
		  
		
	}

}
