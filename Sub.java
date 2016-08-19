import java.util.Scanner;


public class Sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a1=sc.nextLine();
		String a2=sc.nextLine();
		if(a1.contains(a2))
		{
			System.out.println("a1 is a subset of a2");
		}
		else
		{
			System.out.println("a1 is not a subset of s2");
		}

	}

}
